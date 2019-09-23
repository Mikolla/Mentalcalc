package pattern.visitor;

public class SeniorDev implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("senior rewrite bad code...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("senior up database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("senior reliable test...");
    }
}
