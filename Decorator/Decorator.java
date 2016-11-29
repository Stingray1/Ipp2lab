package com.company.Decorator;

import java.lang.invoke.SwitchPoint;

/**
 * Created by vadim on 11/15/16.
 */
public class Decorator {


    public static void main(String[] args)
    {
        Developer developer = new JavaDeveloper();
        System.out.println(developer.makeJob());
        developer = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(developer.makeJob());
    }
}

interface Developer
{
    public String makeJob();
}

class JavaDeveloper implements Developer
{
        @Override
    public String makeJob()
        {
            return   "Write Java Code ";
        }
}

class DeveloperDecorator implements Developer
{
    Developer developer;
    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }
    @Override
        public String makeJob()
    {
        return  developer.makeJob();
    }

}

class SeniorJavaDeveloper extends DeveloperDecorator
{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);

    }

    public String makeCodeReview()
    {
        return "make Code Review";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeCodeReview();
    }
}
