package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class Transaction {

    private Input input;
    private Output output;
    private Object[][] transactionList;
    private Integer transactionId;
    private Balance balance;

    Transaction() {

        input = new Input();
        output = new Output();
        balance = new Balance();
        transactionId = 0;
    }

    Double transaction(Double amount, Double type) {

        amount *= type;

        return balance.getBalance() + amount;
    }

    void printTransaction() {

    }


}
