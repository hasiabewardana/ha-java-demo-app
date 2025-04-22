package first_steps;

public class FirstSteps {
    public static void callFirstJavaProgram() {
        System.out.println("Hello, Hasitha");
    }

    public static void getDataTypeDetails() {
        // Integers
        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        myFirstNumber = 10;
        System.out.println(myFirstNumber);

        myFirstNumber = 1000;
        System.out.println(myFirstNumber);

        myFirstNumber = 10 + 5;
        System.out.println(myFirstNumber);

        myFirstNumber = (10 + 5) + (10 * 2);
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        myThirdNumber = myFirstNumber * 2;
        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(intMaxValue);
        System.out.println("Busted max value: " + (intMaxValue + 1));
        intMaxValue = 2147483647 + 1;
        System.out.println(intMaxValue);

        int intMinValue = Integer.MIN_VALUE;
        System.out.println(intMinValue);
        System.out.println("Busted min value: " + (intMinValue - 1));
        intMinValue = -2147483648 - 1;
        System.out.println(intMinValue);

        int maxIntTest = 2_147_483_647;
        System.out.println(maxIntTest);
        System.out.println("Integer value range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

        // Bytes
        System.out.println("Byte value range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        byte minByteValue = Byte.MIN_VALUE, myByteValue = (byte) (minByteValue / 2);
        System.out.println(myByteValue);

        // Short
        System.out.println("Short value range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        short minShortValue = Short.MIN_VALUE; short myShortValue = (short) (minShortValue / 2);
        System.out.println(myShortValue);

        // Long
        long myLongValue = 2_147_483_648L;
        System.out.println(myLongValue);
        System.out.println("Long value range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

        // Float
        System.out.println("Float value range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        float myFloatValue = (float) 5.25;
        System.out.println(myFloatValue);

        // Double
        System.out.println("Double value range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        // Primitive type challenge
        byte byteValue = 15;
        short shortValue = 2500;
        int intValue = 65000;
        long longValue = 50_000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longValue);

        // Floating-point number challenge
        double pounds = 200d;
        double kilos = pounds * 0.45_359_237d;
        System.out.println(kilos);

        // Char
        char charValue = 'D';
        System.out.println(charValue);

        char unicodeCharValue = '\u0044';
        System.out.println(unicodeCharValue);

        char decimalCharValue = 68;
        System.out.println(decimalCharValue);

        // Char challenge
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;
        System.out.println("My values are " + mySimpleChar + myUnicodeChar + myDecimalChar);

        // Boolean
        boolean isMarried = true;
        System.out.println(isMarried);
    }
}