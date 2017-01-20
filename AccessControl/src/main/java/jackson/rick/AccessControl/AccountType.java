package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class AccountType {

    Input input;
    Output output;

    AccountType() {

        input = new Input();
        output = new Output();
    }

    String chooseAccountType() {

        String entry = chooseAccountTypePrompt();
        Boolean proceed = validateAccountType(entry);

        while (!proceed) {

            output.printLine("Invalid entry.");
            entry = chooseAccountTypePrompt();
            proceed = validateAccountType(entry);
        }

        return entry;
    }

    Boolean validateAccountType(String entry) {

        if (entry.equals("Checking") ||
                entry.equals("Savings") ||
                entry.equals("Investment") ||
                entry.equals("Other")) {
            return true;
        } else {
            return false;
        }
    }

    String chooseAccountTypePrompt() {

        output.printLine("Enter account type (Checking, Savings, Investment," +
                " or Other");
        return input.stringNextLine();
    }
}
