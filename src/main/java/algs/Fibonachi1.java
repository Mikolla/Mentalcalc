package algs;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class Fibonachi1 {
    public static void iterativeFibonachi(int n)
    {
        //0 1 1 2 3 5 8 13
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++)
        {
            c = a + b;
            a = b;
            System.out.print(b + " ");
            b = c;
        }
    }

    public static int fiboneiro(int n) {
        if (n == 0)
        {
            return 0;
        } else if (n == 1) {
            {
                return 1;
            }
        }
        int k = fiboneiro(n - 2) + fiboneiro(n - 1);
        return k;
    }

    public static void main(String[] args) {
        //iterativeFibonachi(8);
        //System.out.println(fiboneiro(8));
         Stream.iterate(new int[]{0, 1}, n -> new int[] {n[1], n[0] + n[1]}).limit(9).map(x -> x[0]).forEach(y -> System.out.println(y));
    }
}
