package pattern.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
         Developer jun = new JunDev();
         Developer senior = new SeniorDev();

         project.beWritten(jun);
        System.out.println("________________");
        project.beWritten(senior);
    }
}
