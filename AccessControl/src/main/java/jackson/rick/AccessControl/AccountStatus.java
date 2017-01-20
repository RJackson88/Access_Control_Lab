package jackson.rick.AccessControl;

import java.util.HashMap;

/**
 * Created by rickjackson on 1/17/17.
 */
class AccountStatus {

    private HashMap<Integer, String> status;

    AccountStatus() {

        status = new HashMap<>();
        status.put(1, "Open");
        status.put(2, "Close");
        status.put(3, "OFAC Freeze");
    }

    String getStatus(Integer key) {
        return status.get(key);
    }
}
