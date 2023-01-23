package equals;

public class EqualsImpl {
    private int x;
    private int y;

    public EqualsImpl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            System.out.println("true if(o == this)");
            return true;
        }
        if(!(o instanceof EqualsImpl)){
            System.out.println("false if(!(o instanceof EqualsImpl))");
            return false;
        }

        EqualsImpl equals = (EqualsImpl)o;
        System.out.println("equals.x == x && equals.y == y");
        return equals.x == x && equals.y == y;
    }
}
