package pattern.abstractFactory.banking;

import pattern.abstractFactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking Project manager manage bank project...");
    }
}
