package pattern.abstractFactory.banking;

import pattern.abstractFactory.Developer;
import pattern.abstractFactory.ProjectManager;
import pattern.abstractFactory.ProjectTeamFactory;
import pattern.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QAtester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingProjectManager();
    }
}
