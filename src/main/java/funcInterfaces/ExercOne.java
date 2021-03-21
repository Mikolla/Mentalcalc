package funcInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExercOne {
    public static void main(String[] args) {
        String string = "WsArR JdAdcVcA BbEbSjT";
        IntStream chars = string.chars();
        chars.filter(x -> Character.isUpperCase(x)).forEach(System.out::print);
        System.out.println();

        chars = string.chars();
        Predicate<Integer> pred = x -> {
            return Character.isUpperCase(x);
        };
        chars.filter(x -> pred.test(x)).mapToObj(x ->String.valueOf((char)x)).forEach(System.out::print);

        /*Stream<Character> st = Stream.of('C','h','t');
        String result = st.map(c->c.toString()).collect(Collectors.joining());
        System.out.println(result);*/

        String hello = "hello world";
        String result = hello.chars().mapToObj(val -> String.valueOf((char) val))
                .reduce("",(s1, s2) -> s1+s2);
        System.out.println(result);
        hello.chars().mapToObj(val -> ((char) val)).forEach(System.out::print);
        System.out.println();
        Stream<Byte> charStream = hello.chars().mapToObj(i->(byte)i);
        Byte[] bytes = charStream.toArray(size -> new Byte[size]);
        long col = string.chars().filter(x -> Character.isLowerCase(x)).count();
        System.out.println("col = " + col);

        List<String> li = Arrays.asList("privet", "lopata", "bitch", "het");
        Optional<String> max1 = li.stream().min(Comparator.comparing(x -> x.length()));
        max1.ifPresent(System.out::print);
    }
}
