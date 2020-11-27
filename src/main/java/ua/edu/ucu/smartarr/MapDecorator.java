package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray, MyFunction action) {
        super(smartArray);
        this.array = Arrays.stream(this.smartArray.toArray()).map(action::apply).toArray();
    }

    @Override
    public String operationDescription() {
        return "Map Decorator: apply action for each element";
    }
}
