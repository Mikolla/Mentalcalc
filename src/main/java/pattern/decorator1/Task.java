package pattern.decorator1;

public class Task {
    public static void main(String[] args) {
        Emloyee worker = new Worker();
        System.out.println(worker.doJob());
        System.out.println("_________________________________");
        Emloyee header = new Header(new Worker());
        System.out.println(header.doJob());
        System.out.println("_________________________________");
        Emloyee director = new Director(new Header(new Worker()));
        System.out.println(director.doJob());
    }
}
