package pattern.decorator;

public class Task {
    public static void main(String[] args) {


        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
        System.out.println("________________________");
        Developer developer1 = new JavaTeamLead(new JavaDeveloper());
        System.out.println(developer1.makeJob());
    }
}
