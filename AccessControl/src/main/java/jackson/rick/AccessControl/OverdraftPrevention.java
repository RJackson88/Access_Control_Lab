package jackson.rick.AccessControl;

import sun.rmi.server.InactiveGroupException;

import java.util.HashMap;

/**
 * Created by rickjackson on 1/17/17.
 */
class OverdraftPrevention {

    private HashMap<Integer, String> status;

    OverdraftPrevention() {

        status = new HashMap<>();
        status.put(1, "Enabled");
        status.put(2, "Disabled");
        status.put(3, "Automatic Account Transfer");
    }

    String getStatus(Integer key) {

        return status.get(key);
    }
}
