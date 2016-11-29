package com.company.AdapterPattern;

public class AdapterPattern {

    public static void main(String[] args) {

	   DatabaseInterface database = new JavaAdapter();
        database.save();
    }
}

interface  DatabaseInterface
{
    void save();
}
class Database implements  DatabaseInterface
{
    @Override
    public void save() {
        System.out.println("Database");
    }
}
class JavaDatabase
{
    void SaveJava()
    {
        System.out.println("JavaDatabase");
    }
}
class JavaAdapter extends JavaDatabase implements DatabaseInterface
{
    @Override
    public void save() {
        SaveJava();
    }
}
