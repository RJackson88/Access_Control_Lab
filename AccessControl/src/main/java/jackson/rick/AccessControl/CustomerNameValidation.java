package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class CustomerNameValidation {

    private Input input;
    private Output output;

    CustomerNameValidation() {

        input = new Input();
        output = new Output();
    }

    String enterCustomerNameWithValidation(String nameType) {

        output.print("\n" + nameType);
        String entry = input.stringNextLine();

        while (entry.isEmpty()) {

            output.printLine(nameType + " cannot be blank.");
            output.print(nameType + ": ");
            entry = input.stringNextLine();
        }

        entry.trim();
        return entry;
    }

    String enterCustomerNameWithoutValidation(String nameType) {

        output.print("\n" + nameType + ": ");
        String entry = input.stringNextLine();
        entry.trim();
        return entry;
    }

    String addNameSpace(String nameType) {

        if (nameType.equals("")) {

            return nameType;
        } else {

            return nameType + " ";
        }
    }
}
