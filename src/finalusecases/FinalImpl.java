package finalusecases;

public /*final*/ class FinalImpl {
    final double PI = 3.14;

    public void printPI(){
        System.out.println(PI);
    }

    public void changePI(double newPI){
        // PI = newPI;
    }

    final void finalMethod(){
        System.out.println("This is a final method.");
    }
}
