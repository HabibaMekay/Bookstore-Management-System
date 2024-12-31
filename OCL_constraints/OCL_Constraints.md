### Constraints for Admin

**Ensure only valid users can be added or removed:**

context Admin
inv: userList->forAll(user | user.id > 0 and user.name <> null)

**An admin cannot add duplicate users:**

context Admin
inv: userList->isUnique(user | user.id)

### Constraints for User

**Username and password must be non-empty:**

context User
inv: not (userName.isEmpty() or password.isEmpty())

**Login status must be consistent:**

context User
inv: if isLoggedIn then not password.isEmpty() else true endif

### Constraints for Transaction

**Transaction date must not be in the future:**

context Transaction
inv: date <= today()

**Total transaction cost must be correctly calculated:**

context Transaction
inv: total = books->collect(b | b.price)->sum()

### Constraints for Stocker

**Stock quantity cannot be negative:**

context Stocker
inv: book.currentStock >= 0

**Only valid books can be updated in stock:**

context Stocker
inv: books->forAll(b | b.id > 0 and b.title <> null)

### Constraints for Cashier

**Scanned book must exist in the system:**

context Cashier
inv: BookList.books->includes(book)

**Transactions must be processed accurately:**

context Cashier
inv: transaction.total = transaction.books->collect(b | b.price)->sum()

### Constraints for Book

**Book price must be non-negative:**

context Book
inv: price >= 0

**Each book must have a unique ID:**

context Book
inv: BookList.books->isUnique(b | b.id)

### Constraints for BookList

**Book removal is only allowed if it exists in the list:**

context BookList
pre: books->includes(book)

### Constraints for Return

**Returned books must belong to a previous transaction:**

context Return
inv: Transaction.books->includes(book)

### Constraints for Purchase

**Purchases must update the stock accurately:**

context Purchase
inv: book.currentStock = book.currentStock@pre - books->size()
