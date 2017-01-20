package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class Customer {

    private Input input;
    private Output output;
    private CustomerName customerName;
    private SocialSecurityNumbers ssn;
    private String prefix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String fullName;
    private String socialSecurityNumber;
    private Integer generateCustomerId;
    private Integer customerId;

    Customer() {

        input = new Input();
        output = new Output();
        customerName = new CustomerName();
        ssn = new SocialSecurityNumbers();
        generateCustomerId = 1;
        customerId = generateCustomerId;
    }

    void enterCustomerName() {

        prefix = customerName.enterPrefix();
        firstName = customerName.enterFirstName();
        middleName = customerName.enterMiddleName();
        lastName = customerName.enterLastName();
        suffix = customerName.enterSuffix();
        socialSecurityNumber = ssn.enterSocialSecurityNumber();
    }

    void customerId() {

        customerId = ++generateCustomerId;
    }
}
