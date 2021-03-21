package algs;

public class Fibonachi {

    //0 1 1 2 3 5 8 13
    static void fibo(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = b;
            b = a + b;
            a = c;
            System.out.print(b + " ");
        }
    }

    static int fibonaher(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        return fibonaher(n - 2) + fibonaher(n - 1);
    }

    public static void main(String[] args) {
        fibo(7);
        System.out.println("fibonaher = " + fibonaher(8));
    }
}
