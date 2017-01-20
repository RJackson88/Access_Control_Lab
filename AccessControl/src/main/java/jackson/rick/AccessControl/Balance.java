package jackson.rick.AccessControl;

import java.math.BigDecimal;

/**
 * Created by rickjackson on 1/17/17.
 */
class Balance {

    private AccountStatus accountStatus;
    private Double startingBalance;
    private Double currentBalance;

    Balance() {

        startingBalance = 0.00;
        currentBalance = startingBalance;
    }

    Double openAccountBalance() {

        return startingBalance;
    }

    Double getBalance() {

        return currentBalance;
    }

    String balanceInquiry(String status) {

        if (!(status.toLowerCase()).equals("ofac freeze")) {

            return getBalance().toString();
        } else {

            return "Balance inquiry is not allowed while account is under " +
                    "OFAC Freeze.";
        }
    }

    String credit(Double amount, String status) {

        if (status.equals("Open")) {

            currentBalance += amount;
            return "Transaction Completed";
        } else {

            return "Transaction Cannot Be Completed";
        }
    }

    String debit(Double amount, String status) {

        if (status.equals("Open") && amount < getBalance()) {

            currentBalance -= amount;
            return "Transaction Completed";
        } else {

            return "Transaction Cannot Be Completed";
        }
    }
}
