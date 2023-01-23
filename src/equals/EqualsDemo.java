package equals;

public class EqualsDemo {
    public static void demoEquals(){
        EqualsImpl equals = new EqualsImpl(2,4);
        System.out.println(equals.equals(equals));
    }
}
