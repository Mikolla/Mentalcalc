package pattern.decorator1;

public class Header extends WorkerDecorator {
    public Header(Emloyee emloyee) {
        super(emloyee);
    }

    public String doComplexJob() {
        return "Do very complex job and smoking...\n";
    }
    @Override
    public String doJob() {
        return super.doJob() + doComplexJob();
    }
}
