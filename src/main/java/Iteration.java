
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteration {

    List<Integer> integers = Stream.of(1, 2, 3).collect(Collectors.toCollection(ArrayList::new));

    public void Iter() {
        Iterator<Integer> i = integers.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public void iter2() {
        int i =0;
        for (Integer in: integers ) {
            i++;
            if (i == 1) {
                integers.remove(2);
                System.out.println("deleted");
            //    break;
            }
        }
    }

    public static void main(String[] args) {
        Iteration it = new Iteration();
        it.Iter();
        it.iter2();

    }

}
