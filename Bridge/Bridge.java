package com.company.Bridge;

public class Bridge {

    public static void main(String[] args) {

        BankApplication bankApplication = new BankApplication(new cppDeveloper());
        bankApplication.developProgram();

    }
}
interface Developer
{
    void doJob();
}
class javaDevelopper implements  Developer
{

    public void doJob() {
        System.out.println("JavaDeveloper java code");
    }
}
class cppDeveloper implements  Developer
{

        public void doJob() {
        System.out.println("cppDevelopper cpp code");
    }
}
 abstract class Program
{
    protected Developer developer;
      Program(Developer developer)
    { this.developer=developer;
    }
    public abstract void developProgram();
}

class BankApplication extends Program
{
   BankApplication(Developer developer)
    {
        super(developer);
    }
    public void developProgram() {
        System.out.println("BankSystem");
        developer.doJob();
    }
}