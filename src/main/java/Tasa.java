public class Tasa {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if (   (i % 7 == 0 || String.valueOf(i).endsWith("4"))
                && (i > 25 || String.valueOf(i).endsWith("5"))
                && (i % 13 == 0 || i < 26 )
            ) {
                System.out.println(i);
            }
        }
    }
}
