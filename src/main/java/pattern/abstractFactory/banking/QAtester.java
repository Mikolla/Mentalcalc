package pattern.abstractFactory.banking;

import pattern.abstractFactory.Tester;

public class QAtester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester makes tests for code...");
    }
}
