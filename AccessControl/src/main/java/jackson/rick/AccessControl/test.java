package jackson.rick.AccessControl;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rickjackson on 1/18/17.
 */
public class test {

    private HashMap<String, String> second = new HashMap<>();
    private HashMap<Integer, HashMap> first = new HashMap<>();
    private Output output = new Output();

    test() {

    }

    String add() {
        second.put("1A", "1B");
        first.put(1, second);
        return second.get("1A");
    }
}
