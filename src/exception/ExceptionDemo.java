package exception;

public class ExceptionDemo {
    public static void exceptionDemo(){
        ExceptionImpl exception = new ExceptionImpl();
        exception.testMethod1();
        try {
            exception.testMethod2();
        } catch (Exception e) {
            System.out.println("Caught the exception from testMethod2");
        }
        exception.testMethod3();
    }
}
