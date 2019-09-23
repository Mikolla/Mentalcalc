package pattern.visitor;

public class JunDev implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("junior write bad code...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("junior drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("junior make poor test...");
    }
}
