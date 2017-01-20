package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
class SocialSecurityNumbers {

    private Input input;
    private Output output;
    private Short areaNumber;
    private Short groupNumber;
    private Short serialNumber;
    private String temp = "";
    private String socialSecurityNumber;

    SocialSecurityNumbers() {

        input = new Input();
        output = new Output();
    }

    String enterSocialSecurityNumber() {

        enterAreaNumber();
        enterGroupNumber();
        enterSerialNumber();

        return socialSecurityNumber;
    }


    void enterAreaNumber() {

        Boolean proceed = false;

        output.print("Enter Social Security Number: ");
        areaNumber = input.nextShort();

        while (!proceed) {

            if (areaNumber <= 0 ||
                    areaNumber == 666 ||
                    areaNumber >= 900) {

                output.printLine("Invalid number.");
                output.print("Enter Social Security Number: ");
                areaNumber = input.nextShort();
            } else {

                temp = String.format("%03d", areaNumber);
                proceed = true;
            }
        }

        socialSecurityNumber = temp + "-";
    }

    void enterGroupNumber() {

        Boolean proceed = false;

        output.print(socialSecurityNumber);
        groupNumber = input.nextShort();

        while(!proceed) {

            if (groupNumber <= 0 ||
                    groupNumber >= 100) {

                output.printLine("Invalid number.");
                output.print("Enter Social Security Number: ");
                output.print(socialSecurityNumber);
                groupNumber = input.nextShort();
            } else {

                temp = String.format("%02d", groupNumber);
                proceed = true;
            }
        }

        socialSecurityNumber += temp + "-";
    }

    void enterSerialNumber() {

        Boolean proceed = false;
        output.print(socialSecurityNumber);
        serialNumber = input.nextShort();

        while (!proceed) {

            if (serialNumber <= 0 || serialNumber >= 10000) {

                output.printLine("Invalid number.");
                output.print("Enter Social Security Number: ");
                output.print(socialSecurityNumber);
                serialNumber = input.nextShort();
            } else {

                temp = String.format("%04d", serialNumber);
                proceed = true;
            }
        }

        socialSecurityNumber += temp;
    }
}
