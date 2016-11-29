package com.company.AbstractFactory;

 class WebsiteProject {

    public static void main(String[] args) {

        ProjectTeamFactory factory1 = new WebSiteApplication();
        WebDevelopper developper = factory1.getDeveloper();
        Tester tester = factory1.getTester();
        ProjectManager manager = factory1.getProjectManager();
        developper.writeCode();
        tester.testCode();
        manager.manageproject();

        ProjectTeamFactory factory2 = new DesktopApplication();
        WebDevelopper dev = factory2.getDeveloper();
        Tester tester1 = factory2.getTester();
        ProjectManager manager1 = factory2.getProjectManager();
        dev.writeCode();
        tester1.testCode();
        manager1.manageproject();



    }
}

interface WebDevelopper
{
    void writeCode();
}
interface Tester
{
    void testCode();
}
interface ProjectManager
{
    void manageproject();
}


class phpDeveloper implements WebDevelopper
{
    @Override
    public void writeCode()
    {
        System.out.println("php developper");
    }
}

class TestDeveloper implements Tester
{
    @Override
    public void testCode()
    {
        System.out.println("test website");
    }
}

class ProjectManagerDeveloper implements ProjectManager
{
    @Override
    public void manageproject()
    {
        System.out.println("projectManager manage website");
    }
}
class appDeveloper implements WebDevelopper
{
    @Override
    public void writeCode()
    {
        System.out.println("Desktop developper");
    }
}

class TestApp implements Tester
{
    @Override
    public void testCode()
    {
        System.out.println("Desktop test website");
    }
}

class ProjectAppDevelopper implements ProjectManager
{
    @Override
    public void manageproject()
    {
        System.out.println("projectManager Desktop manage website");
    }
}


 interface ProjectTeamFactory
 {
     WebDevelopper getDeveloper();
     Tester getTester();
     ProjectManager getProjectManager();
 }

class WebSiteApplication implements ProjectTeamFactory
{
   public WebDevelopper getDeveloper()
    {
        return new phpDeveloper();

    }
   public Tester getTester()
    {
        return new TestDeveloper();

    }
    public ProjectManager getProjectManager()
    {
        return new ProjectManagerDeveloper();
    }
}


class DesktopApplication implements ProjectTeamFactory
{
    public WebDevelopper getDeveloper()
    {
        return new appDeveloper();

    }
    public Tester getTester()
    {
        return new TestApp();

    }

    public ProjectManager getProjectManager()
    {
        return new ProjectAppDevelopper();
    }
}
