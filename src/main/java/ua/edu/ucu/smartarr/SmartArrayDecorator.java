package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;
    protected Object[] array;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public int size() {
        return this.array.length;
    }

    @Override
    public Object[] toArray() {
        return this.array.clone();
    }
}
