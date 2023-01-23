package exception;

public class ExceptionImpl {
    public void testMethod1(){
        try {
            // code that may throw an exception
            throw new Exception();
        } catch (Exception e) {
            // code to handle the exception
            System.out.println("Caught the exception from testMethod1");
        }
    }

    // The throws propagate the exception to the caller
    public void testMethod2() throws Exception{
        throw new Exception();
    }

    public void testMethod3(){
        try {
            // code that may throw an exception
            throw new Exception();
        } catch (Exception e) {
            // code to handle the exception
            System.out.println("Caught the exception from testMethod3");
        } finally {
            // code that must be executed regardless of whether an exception was thrown or not
            System.out.println("finally block in testMethod3");
        }
    }
}
