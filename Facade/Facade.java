package com.company.Facade;

public class Facade {

    public static void main(String[] args) {

                WorkFlow work = new WorkFlow();
                work.solveProblems();

    }
}

class Developer
{
    public void doJobBeforeDeadLine(BugTracker bugTracker)
    {
        if(bugTracker.isActiveSprint())
        {
            System.out.println("Developer is solving problem");
        }
        else
        {
            System.out.println ("Developer is reading Habrahabr");
        }
    }
}

class Job
{
    public void doJob() {
        System.out.println("Do Job");
    }
}
class BugTracker
{
    private boolean activeSprint;

    public boolean isActiveSprint()
    {
        return activeSprint;
    }
    public void startSprint()
    {
        System.out.println("Spring is Active");
        activeSprint=true;
    }
    public void finishSprint()
    {
        System.out.println("Spring is Off");
        activeSprint=false;
    }
}

class WorkFlow
{
    Developer developer = new Developer();
    Job job= new Job();
    BugTracker bug = new BugTracker();


    public void solveProblems()
    {
        job.doJob();
        bug.startSprint();
        developer.doJobBeforeDeadLine(bug);
    }
}




