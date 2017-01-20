package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class Account {

    private AccountNumber accountNumber;
    private Balance balance;
    private Customer accountHolder;
    private Integer generateHolderId;

    Account() {

        accountNumber = new AccountNumber();
        balance = new Balance();
        accountHolder = new Customer();
        generateHolderId = 1;
    }

    void createNewAccount() {

        accountNumber.createNewAccount();

    }
}