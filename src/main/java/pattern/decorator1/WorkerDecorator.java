package pattern.decorator1;

public class WorkerDecorator implements Emloyee {
    Emloyee emloyee;

    public WorkerDecorator(Emloyee emloyee) {
        this.emloyee = emloyee;
    }

    @Override
    public String doJob() {
        return emloyee.doJob();
    }
}
