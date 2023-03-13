import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет " + s + "!!!");
            }
        };
        Consumer<String> consumer1 = s -> System.out.println("Привет " + s + "!!");
        consumer.accept("Alex");
        consumer1.accept("Bob");
    }
}