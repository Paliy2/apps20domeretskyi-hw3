package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] array;

    public BaseArray(Object[] source) {
        this.array = source.clone();
    }

    @Override
    public Object[] toArray() {
        return array.clone();
    }

    @Override
    public String operationDescription() {
        return "No decorators available";
    }

    @Override
    public int size() {
        return array.length;
    }
}