package com.company.Singleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProgramLogger.getInstance().addLog("Vasile");
        ProgramLogger.getInstance().addLog("Matei ");
        ProgramLogger.getInstance().showLog();
    }
}
class ProgramLogger {

    private static ProgramLogger programLogger;
    private String logFile = "This is logFile. \n";
    private ProgramLogger(){}
    public static synchronized  ProgramLogger getInstance()
    {
        if (programLogger==null)
        {
            programLogger=new ProgramLogger();
        }
        return programLogger;
    }
  public  void addLog(String data)
    {
        this.logFile+=data +"\n";

    }

   public void showLog()
    {
        System.out.println (logFile);
    }
}
