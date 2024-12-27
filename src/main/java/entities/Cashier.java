package entities;

public class Cashier extends User {
    public Cashier(String name, String password, int id) {
        super(name,password,"cashier", id);
    }
    public String getPassword() {
        return super.getPassword();
    }
    public void setPassword(String password) {
        super.setPassword(password);
    }
    public int getId() {
        return super.getId();
    }
    public void setId(int id) {
        super.setId(id);
    }
    public String getUsername() {
        return super.getUsername();
    }
    public void setUsername(String username) {
        super.setUsername(username);
    }
    public String getRole(){
        return super.getRole();
    }
    public void setRole(String role){
        super.setRole(role);
    }

    @Override
    boolean login(String username, String password) {
        //implement
        return false;
    }

    @Override
    void logout() {
        //implement
    }

    /// ////////////////////////////////
    /// ////////////////////////////////
    /// ////////////////////////////////

    public int scanBook(int id) {
        return id;  //check here idk
    }

//    public Transaction processTransaction() {
//        //this needs to be fixed in the sequence diagram process book sale
//         //implement
//    }

//    public BookDescription viewBookDetails(Book book){
//        //this needs to be fixed bardo in class diagram
//    }
}
