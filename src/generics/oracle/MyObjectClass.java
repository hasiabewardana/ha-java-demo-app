package generics.oracle;

/*We can pass any type of object to this class but there is no way to check what has been passed.
  For example, we may mistakenly pass Integer into the class where it is required a string.*/
public class MyObjectClass {

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
