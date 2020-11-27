package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    public FilterDecorator(SmartArray smartArray, MyPredicate filterBy) {
        super(smartArray);
        this.array = Arrays.stream(
                this.smartArray.toArray()).filter(filterBy::test).toArray();
    }

    @Override
    public String operationDescription() {
        return "Filter Decorator: filters depends on the given predicate.";
    }
}
