package jackson.rick.AccessControl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rickjackson on 1/17/17.
 */
public class InterestRate {

    Input input;
    Output output;

    InterestRate() {

        input = new Input();
        output = new Output();
    }

    Double getInterestRate(Integer key) {

        HashMap<Integer, Double> interestRates = new HashMap<>();
        interestRates.put(1, 0.01);
        interestRates.put(2, 0.03);
        interestRates.put(3, 0.03);
        interestRates.put(4, 0.05);
        interestRates.put(5, 0.05);
        interestRates.put(6, 0.10);

        return interestRates.get(key);
    }
}
