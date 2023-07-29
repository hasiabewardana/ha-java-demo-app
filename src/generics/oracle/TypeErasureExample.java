package generics.oracle;

public class TypeErasureExample<T> {

    private final T value;

    public TypeErasureExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
