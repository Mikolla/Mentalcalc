package pattern.abstractFactory.banking;

import pattern.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDev writes java code...");
    }
}
