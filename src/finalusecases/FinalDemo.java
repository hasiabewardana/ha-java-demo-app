package finalusecases;

public class FinalDemo {
    public static void demoFinalVariable(){
        FinalImpl aFinal = new FinalImpl();
        aFinal.printPI();
        aFinal.changePI(5.00);
        aFinal.printPI();

        FinalImplChild finalImplChild = new FinalImplChild();
        finalImplChild.finalMethod();
    }
}
