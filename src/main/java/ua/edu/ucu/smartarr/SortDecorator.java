package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smarr, MyComparator sortBy) {
        super(smarr);
        this.array = Arrays.stream(this.smartArray.toArray()).sorted(sortBy).toArray();
    }

    @Override
    public String operationDescription() {
        return "Sort Decorator";
    }
}
