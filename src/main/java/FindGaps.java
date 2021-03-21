import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class FindGaps {




    public static void main(String[] args) {
        /*int[] a = {1, 2, 3, 5, 8, 11};
        Integer[] aa = Arrays.stream( a ).boxed().toArray( Integer[]::new );
        IntStream.rangeClosed(a[0], a[a.length-1])
                .filter(x -> !Arrays.asList(aa).contains(x)).
                forEach(e -> System.out.print(e + " "));*/
        String sber = "Сссбббеерр, пррриииввеетттт! Как дела? А?";
        String newSber = "";
        char c = sber.charAt(0);
        newSber += c;
        for (int i = 0; i < sber.length() - 1; i++)
        {
            char c1 = sber.charAt(i + 1);
            if (Character.toLowerCase(c) != c1)
            {
                newSber += c1;
            }
            c = c1;
        }
        System.out.println(newSber);
    }
}
