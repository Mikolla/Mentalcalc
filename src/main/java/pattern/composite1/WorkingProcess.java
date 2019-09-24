package pattern.composite1;

public class WorkingProcess {
    public static void main(String[] args) {
        EnterPrise enterPrise = new EnterPrise();

        Employee leadDesigner = new Designer();
        Employee designer = new Designer();
        Employee counter = new Calculator();

        enterPrise.addEmployee(leadDesigner);
        enterPrise.addEmployee(designer);
        enterPrise.addEmployee(counter);

        enterPrise.makeLocator();
    }
}
