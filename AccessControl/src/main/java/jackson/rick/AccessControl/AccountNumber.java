package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class AccountNumber {

    private String accountNumber;
    private static Integer currentGeneratedNumber;

    AccountNumber() {

        accountNumber = "";
        currentGeneratedNumber = 1;
    }

    Integer getCurrentGeneratedNumber() {

        return currentGeneratedNumber;
    }

    String createNewAccount() {

        accountNumber = accountNumberFormat(currentGeneratedNumber);
        currentGeneratedNumber++;

        return accountNumber;
    }

    String accountNumberFormat(Integer nextNumber) {

        return String.format("%010d", nextNumber);
    }

//    String returnNextAccountNumber() {
//
//        return accountNumberFormat(currentGeneratedNumber + 1);
//    }
}
