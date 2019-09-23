package pattern.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeakReport() {
        return "Send weak report to customer!";
    }

    @Override
    public String makeJob() {
         return super.makeJob() + sendWeakReport();
    }
}
