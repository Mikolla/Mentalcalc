import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.DoubleStream;

public class FunctInterfaces {
    IntUnaryOperator intUnaryOperator = x -> {
        return  x * x;
    };

    IntUnaryOperator intUnaryOperator1 = x -> x * x;

    IntConsumer intConsumer = x -> System.out.println(x);

    IntUnaryOperator iuo = x -> Math.abs(x);

    IntPredicate intPredicate = x -> x > 5;

    public static void main(String[] args) {
        FunctInterfaces F = new FunctInterfaces();

        int i1 = F.intUnaryOperator.applyAsInt(5);
        int i2 = F.intUnaryOperator1.applyAsInt(6);
        F.intConsumer.accept(5);
        int i3 = F.iuo.applyAsInt(-3);
        boolean boo = F.intPredicate.test(6);
        List<Integer> list = Arrays.asList(1, 3, 5,  15, 4, 10, 2);
        int sum = list.stream().mapToInt(x -> x).sum();
        System.out.println("sum of the list = " + sum);
        DoubleSupplier doubleSupplier = Math::random;
        DoubleStream.generate(doubleSupplier).limit(10).mapToObj(x -> String.valueOf(x) + " ").forEach(System.out::print);
        System.out.println();
        DoubleStream.generate(doubleSupplier).limit(10).mapToInt(x -> (int) Math.round(x * 10)).mapToObj(x -> String.valueOf(x) + " ").forEach(System.out::print);
        System.out.println();
        DoubleStream.generate(doubleSupplier).limit(10).mapToInt(x -> (int) Math.round(x * 10)).map(x -> x * x).mapToObj(x -> String.valueOf(x) + " ").forEach(System.out::print);

        System.out.println("Ints = ");
        Random random = new Random();
        random.ints().peek(System.out::println).limit(5).max().ifPresent(System.out::println);
        Instant now = Instant.now();
        System.out.println("\r\n instant time  =  "  + now);
        System.out.println("\r\n instant time  =  "  + (new Date()).toInstant());
        char c ='Ы';


    }
}
