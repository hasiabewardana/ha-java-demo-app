package generics.oracle;

import java.util.List;

public class WildcardsExample {

    public static double sumOfNumbers(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
