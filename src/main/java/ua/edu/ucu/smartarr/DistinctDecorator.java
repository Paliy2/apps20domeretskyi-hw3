package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.LinkedHashSet;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        this.array = new LinkedHashSet<>(Arrays.asList(this.smartArray.toArray())).toArray();
    }

    @Override
    public String operationDescription() {
        return "Distinct Decorator: Removes duplicates from array";
    }
}
