package pattern.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer d1 = new JavaDeveloper();
        Developer d2 = new JavaDeveloper();
        Developer d3 = new CppDeveloper();
        Developer d4 = new CppDeveloper();

        team.addDeveloper(d1);
        team.addDeveloper(d2);
        team.addDeveloper(d3);
        team.addDeveloper(d4);

        team.createProject();
    }
}
