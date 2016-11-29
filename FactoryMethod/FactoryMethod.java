package com.company.FactoryMethod;

public class FactoryMethod {

    public static void main(String[] args) {
	  DeveloperFactory factory = new CsharpDeveloperFactory();
        Developper developer = factory.createDeveloper();
        developer.writeCode();

    }
}

interface Developper
{
    void writeCode();
}

class cSharpDeveloper implements  Developper
{
    public void writeCode()
    {
        System.out.println ("Write C# Code()");
    }
}

class CppDeveloper implements  Developper
{
    public void writeCode()
    {
        System.out.println ("Write C++ Code()");
    }
}

interface DeveloperFactory
{
    Developper createDeveloper();
}
class CsharpDeveloperFactory implements  DeveloperFactory
{
    @Override
    public Developper createDeveloper() {
        return new cSharpDeveloper();
    }
}
class CppDeveloperFactory implements  DeveloperFactory
{
    @Override
    public Developper createDeveloper() {
        return new CppDeveloper();
    }
}