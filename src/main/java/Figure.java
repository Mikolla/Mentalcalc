import java.lang.reflect.Constructor;
import java.util.*;
import java.util.function.ObjDoubleConsumer;

public abstract class Figure {
    int x;
    int y;

   // public abstract int Perimetr();

    public int Area() {
        return x * y;
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figure() {
    }

    public static void main(String[] args) {
        int[] r = new int[] {9, 4, 3, 8, 12, 153, 267, 13, 11, 998875};// массив
        for (int v : r) {
            System.out.print(v + " ");
        }
        System.out.println();
        int t;// временная переменная
        for (int i = 0; i < r.length; i++) {
            for (int j = i + 1; j < r.length; j++) {
                if (r[j] > r[i]) {
                    t = r[i];//9
                    r[i] = r[j];
                    r[j] = t;
                }
                System.out.println("i = " + i + " j = " + j);
                for (int v : r) {
                    System.out.print(v + " ");
                }
                System.out.println();
            }
        }
    }

}

class Rect extends Figure {
    String color;

    public Rect(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public Rect(int x, int y) {
        super(x, y);
    }

    public Rect() {
    }

   /* public Rect() {
    } */



    public int Perimetr() {
        return x + y;
    }


    /*read - get
    могут прилететь даблы, инты, шорты, поэтому нельзя добавить конкретно дабл
    но можно прочесть намбер, т.к. все эти классы входят в него
    * */
    public void Producer(List<? extends Number> list) {
        Number nu = list.get(0);
        Object nu1 = list.get(0);
        System.out.println(nu.toString());
    }

    /*add
    могут прилететь инты, намберы, обджекты - родители интежеров
    нельзя прочесть намбер или инт, т.к. там может быть обждект
    за то можно всегда добавть интежер гарантированно, т.к. он в них всех входит
    * */
    public void Consumer(List<? super Integer> list) {
        Integer n = Integer.valueOf(1000);
        Object nu1 = list.get(0);
        System.out.println(list.add(n));
    }

    public static void main(String[] args) {
        Rect rect = new Rect(2, 5, "red");
        Rect rect1 = new Rect(2, 5);
        Rect rect2 = new Rect();
        int a = rect.Area();
        int p = rect.Perimetr();
        Object o = new Object();
        Class s = rect.getClass();
        Class s1 = rect.getClass().getSuperclass();
        Constructor<?>[] c = rect.getClass().getConstructors();
        rect1.equals(rect2);
        int  i = rect1.hashCode();

        List<? extends Number> numbers = new ArrayList<Integer>();
        Number n = new Integer(1);


        List<? extends Number> foo1 = new ArrayList<Number>();  // Number "extends" Number (in this context)
        List<? extends Number> foo2 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> foo3 = new ArrayList<Double>();  // Double extends Number
        foo1.contains(Integer.valueOf(1));
        foo2.contains(Integer.valueOf(1));
        foo3.contains(Integer.valueOf(1));
        foo2.contains(Double.valueOf(1L));
       // Number nu = foo2.get(0);
       // Object ii = foo3.get(0);
       // foo1.add(new Object());
       // foo2.add(Integer.valueOf(1));
       // foo1.add(n));


        List<? super Integer> foo4 = new ArrayList<>();  // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> foo5 = new ArrayList<Number>();   // Number is a superclass of Integer
        List<? super Integer> foo6 = new ArrayList<Object>();   // Object is a superclass of Integer
     //   foo4.add(Integer.valueOf(1));
//        Object n1 = foo6.get(0);
        foo4.add(Integer.valueOf(1));
        foo6.add(Integer.valueOf(2));

        List<? super Integer> list = new ArrayList();
        list.add(1);
        Object text = list.get(0);
        System.out.print(text);

        List<? super Integer> list1 = new ArrayList();
        list.add(1);
        Object text1 = list.get(0);
        System.out.println(text);

        List<? super Number> foo7 = new ArrayList<Number>(); // Number is a "super" of Number
        List<? super Number> foo8 = new ArrayList<Object>(); // Object is a "super" of Number
        foo7.add(new Integer(1));
        foo8.add(n);
        foo8.add(new Double(1));
        Object n12 = foo7.get(0);


        List<Integer> integers = new ArrayList<>();
        integers.add(125);
        rect.Producer(integers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(125d);
        rect.Producer(doubles);

        List<Number> numbers1 = new ArrayList<>();
        numbers1.add(1255d);
        rect.Consumer(numbers1);

        List<Integer> integers1 = new ArrayList<>();
        integers.add(1255);
        rect.Consumer(integers1);

        List<Object> objects = new ArrayList<>();
        objects.add(1255);
        rect.Consumer(objects);


        Collection<String> arrayList = new ArrayList<>();
        arrayList.clear();


    }
}
