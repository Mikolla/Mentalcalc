package pattern.abstractFactory.webSite;

import pattern.abstractFactory.Developer;
import pattern.abstractFactory.ProjectManager;
import pattern.abstractFactory.ProjectTeamFactory;
import pattern.abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSiteProjectManager();
    }
}
