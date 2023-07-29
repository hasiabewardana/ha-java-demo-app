package generics.oracle;

import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

    public static void demoGenerics() {
        NoCast noCast = new NoCast();

        // Demo casting
        noCast.demoCast();

        // Demo no casting with generics
        noCast.demoNoCast();

        // Invoking and Instantiating a Generic Type
        MyGenericClass<String> stringMyGenericClass = new MyGenericClass<>();
        stringMyGenericClass.setT("Hello");
        System.out.println(stringMyGenericClass.getT());

        MyGenericClass<Integer> integerMyGenericClass = new MyGenericClass<>();
        integerMyGenericClass.setT(1000);
        System.out.println(integerMyGenericClass.getT());

        // Type inference
        // Mobile plan
        TelecomServicePlan<String, Integer> mobilePlan = new TelecomServicePlanImpl<>("Mobile_Plan_1", 5, 200.00);
        System.out.println(mobilePlan.getPlanName());
        System.out.println(mobilePlan.getDataLimit());
        System.out.println(mobilePlan.getMonthlyCost());

        // Broadband plan
        TelecomServicePlan<String, Double> broadbandPlan = new TelecomServicePlanImpl<>("Broadband_Plan_1", 30.50, 2000.00);
        System.out.println(broadbandPlan.getPlanName());
        System.out.println(broadbandPlan.getDataLimit());
        System.out.println(broadbandPlan.getMonthlyCost());

        // Wildcards examples
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println(WildcardsExample.sumOfNumbers(integers));
        System.out.println(WildcardsExample.sumOfNumbers(doubles));

        // Type erasure examples
        TypeErasureExample<Integer> integerObject = new TypeErasureExample<>(42);
        TypeErasureExample<String> stringObject = new TypeErasureExample<>("Hello");

        System.out.println(integerObject.getValue()); // Output: 42
        System.out.println(stringObject.getValue()); // Output: Hello

        System.out.println(integerObject.getValue() instanceof Integer); // Output: true
        System.out.println(stringObject.getValue() instanceof String); // Output: true

        // At runtime, both classes are treated as Object
        System.out.println(integerObject.getValue() instanceof Object); // Output: true
        System.out.println(stringObject.getValue() instanceof Object); // Output: true
    }
}
