package pattern.decorator1;

public class Director extends WorkerDecorator {
    public Director(Emloyee emloyee) {
        super(emloyee);
    }

    public String doLeaderWork() {
        return "reading emails, drinking coffee...";
    }

    @Override
    public String doJob() {
        return super.doJob() + doLeaderWork();
    }
}
