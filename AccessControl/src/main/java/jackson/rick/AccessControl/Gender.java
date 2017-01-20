package jackson.rick.AccessControl;

/**
 * Created by rickjackson on 1/17/17.
 */
public class Gender {

    Input input;
    Output output;

    Gender() {

        input = new Input();
        output = new Output();
    }

    String enterGender() {

        String entry = enterGenderPrompt();
        Boolean proceed = validateGenderEntry(entry);

        while (!proceed) {

            output.printLine("Invalid entry.");
            entry = enterGenderPrompt();
            proceed = validateGenderEntry(entry);
        }

        return genderEntrySwitch(entry);
    }

    String enterGenderPrompt() {

        output.printLine("Gender (Male or Female)");
        String entry = input.stringNextLine();

        return entry.toLowerCase();
    }

    Boolean validateGenderEntry(String entry) {

        if (entry.equals("male") ||
                entry.equals("female") ||
                entry.equals("m") ||
                entry.equals("f")) {
            return true;
        } else {
            return false;
        }
    }

    String genderEntrySwitch(String entry) {

        switch (entry) {

            case "male":
                entry = "Male";
                break;
            case "female":
                entry = "Female";
                break;
            case "m":
                entry = "Male";
                break;
            case "f":
                entry = "Female";
                break;
            default:
                break;
        }

        return entry;
    }
}
