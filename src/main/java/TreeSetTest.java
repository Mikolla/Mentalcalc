import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    TreeSet<Integer> integerSet = new TreeSet<>();
    public void FillSet () {
        integerSet.add(9);
        integerSet.add(5);
        integerSet.add(4);
        integerSet.add(7);
        integerSet.add(6);
        integerSet.add(8);
        integerSet.add(2);
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(3);
    }

    public void FillSetInOrder () {
        integerSet.clear();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);
        integerSet.add(6);
        integerSet.add(7);
        integerSet.add(8);
        integerSet.add(9);
        integerSet.add(10);
        integerSet.descendingSet();
        NavigableSet<Integer> treereverse = integerSet.descendingSet();
        Iterator<Integer> it = treereverse.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        TreeSetTest t = new TreeSetTest();
        t.FillSetInOrder();

    }
}
