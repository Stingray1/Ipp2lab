package com.company.Proxy;

/**
 * Created by vadim on 11/15/16.
 */
public class Proxy {

    public static void main(String[] args) {

        Project project  =new RealProject("http//torrentsmd.com");
        project.run();

        project = new ProxyProject("http//torrentsmd.com");
        project.run();


    }
}
interface Project
{
    public void run();
}

 class RealProject implements  Project
{

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load()
    {
        System.out.println("Loading project from url");
    }
    @Override
    public void run() {

        System.out.println("Running project "+url +"...");
    }
}

class ProxyProject implements  Project
{
    private String url;
    private  RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(realProject==null)
        {
            realProject = new RealProject(url);

        }
        realProject.run();

    }
}



