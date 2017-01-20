package jackson.rick.AccessControl;

import java.util.Scanner;

/**
 * Created by rickjackson on 1/17/17.
 */
public class Input {

    private Scanner input;
    private Output output;

    public Input() {

        input = new Scanner(System.in);
        output = new Output();
    }

    String stringNextLine() {

        return input.nextLine();
    }

    Short nextShort() {

        Short result = input.nextShort();
        input.nextLine();
        return result;
    }
}
