package pattern.abstractFactory.webSite;

import pattern.abstractFactory.ProjectManager;

public class WebSiteProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web site project manager manage web site project...");
    }
}
