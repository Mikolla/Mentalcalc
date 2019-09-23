public class Program{


    protected int sum(int x, int y){

        return x + y;
    }


    protected double sum(double x, double y){

        return x + y;
    }

    public int sum(int x, int y, int z){

        return x + y + z;
    }

    public static void main(String[] args) {

        Program program = new Program();
        ExtendsProg extendsProg = new ExtendsProg();
        System.out.println(program.sum(2, 3));          // 5
        System.out.println(program.sum(4.5, 3.2));      // 7.7
        System.out.println(program.sum(4, 3, 7));       // 14

        System.out.println(extendsProg.sum(2, 3));          // 5
        System.out.println(extendsProg.sum(4.5, 3.2));      // 7.7
        System.out.println(extendsProg.sum(4, 3, 7));       // 14
        System.out.println(extendsProg.sum(4, 3, "123"));       // 14
    }
}

class ExtendsProg extends Program {

  /*  public int sum(int x, int y){

        return x + y;
    }*/

    int sum(int x, int y, String s){

        return x + y;
    }

    @Override
    public double sum(double x, double y) {
        return super.sum(x, y);
    }

    @Override
    protected int sum(int x, int y) {
        return super.sum(x, y);
    }

    @Override
    public int sum(int x, int y, int z) {
        return super.sum(x, y, z);
    }
}