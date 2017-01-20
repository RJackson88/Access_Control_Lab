package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class CustomerName {

    private Input input;
    private Output output;
    private CustomerNameValidation validateName;

    CustomerName() {

        input = new Input();
        output = new Output();
        validateName = new CustomerNameValidation();
    }

    String enterPrefix() {

        return validateName.enterCustomerNameWithoutValidation("Prefix");
    }

    String enterFirstName() {

        return validateName.enterCustomerNameWithValidation("First name");
    }

    String enterMiddleName() {

        return validateName.enterCustomerNameWithoutValidation("Middle name");
    }

    String enterLastName() {

        return validateName.enterCustomerNameWithValidation("Last name");
    }

    String enterSuffix() {

        return validateName.enterCustomerNameWithoutValidation("Suffix");
    }

    String getFullCustomerName(String prefix, String firstName, String
            middleName, String lastName, String suffix) {

        return validateName.addNameSpace(prefix) +
                validateName.addNameSpace(firstName) +
                validateName.addNameSpace(middleName) +
                validateName.addNameSpace(lastName) +
                suffix;
    }
}
