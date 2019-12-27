package methodReference;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    final static String name = "근휘";

    public MethodReference(String s) {
    }

    public static void consumer() {
        Consumer<String> consumer = System.out::println;
        consumer.accept(name);
    }

    public static void supplier() {
        Supplier<Integer> supplier = name::length;
        System.out.println(supplier.get());
    }

    public static void binaryOperator() {
        BinaryOperator<Integer> binaryOperator = Math::max;
        System.out.println(binaryOperator.apply(1, 10));
    }

    public static void function() {
        Function<String, MethodReference> function = MethodReference::new;
        MethodReference methodReference = function.apply("돼지");
    }
}
