package InbuiltFuctionalInterface;

import methodrefrence.MyClass;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        //Consumer-This represents an operation that accepts a single input and returns no value or result.
        Consumer<String> consumer = myClass::displayDetails;
        consumer.accept("Akshit");

        //Supplier-This represents a supplier of results, providing a value without taking any input.
        Supplier<Double> supplier = myClass::getPI;
        System.out.println(supplier.get());

        //Predicate-It represents a predicate/condition, a boolean-valued function that checks a condition on an input.
        String string = "akshit";
        Predicate<String> predicate = string::equals;
        System.out.println(predicate.test("akshit"));
    }
}
