package generics.oracle;

/*We can check the type that we should to pass into the class.*/
public class MyGenericClass<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
