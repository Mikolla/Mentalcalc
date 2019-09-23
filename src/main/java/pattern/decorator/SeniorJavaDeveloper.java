package pattern.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeRevew() {
        return "Make code revew!";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeRevew();
    }
}
