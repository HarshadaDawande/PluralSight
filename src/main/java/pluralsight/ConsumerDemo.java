package main.java.pluralsight;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {

    public void whenNamesPresentConsumeAll(){
        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(printConsumer);
    }
}
