package pattern.factoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDevFactoryBySpec("cpp");
        Developer dev = developerFactory.createDeveloper();
        dev.writeCode();

    }

    static DeveloperFactory createDevFactoryBySpec(String spec) {
        if (spec.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (spec.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("now such speciality");
        }
    }
}
