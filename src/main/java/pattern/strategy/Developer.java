package pattern.strategy;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }

    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Coding());
        developer.executeActivity();
        developer.setActivity(new Reading());
        developer.executeActivity();
        developer.setActivity(new Training());
        developer.executeActivity();
        developer.setActivity(new Sleeping());
        developer.executeActivity();


    }
}
