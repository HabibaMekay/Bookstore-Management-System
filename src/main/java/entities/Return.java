package entities;

public class Return extends Transaction {

    public Return(int transactionID, int cashierID) {
        super(transactionID, "return", cashierID);
    }

    @Override
    public void process() {

    }
}
