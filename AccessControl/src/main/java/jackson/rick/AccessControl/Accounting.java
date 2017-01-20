package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class Accounting {

    private Input input;
    private Output output;
    private Double startingBalance;
    private Double currentBalance;

    Accounting() {

        input = new Input();
        output = new Output();
        startingBalance = 0.00;
        currentBalance = 0.00;
    }

    Double getCurrentBalance() {

        return currentBalance;
    }

    Double transaction(Double amount, Double type) {

        amount *= type;

        return currentBalance += amount;
    }
}
