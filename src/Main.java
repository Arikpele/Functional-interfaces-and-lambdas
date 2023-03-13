import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> number = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 1000);
            }
        };
        Supplier<Integer> number2 = () -> (int) (Math.random() * 1000);

    }
}