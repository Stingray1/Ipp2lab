package com.company.Prototype;

public class Prototype {

    public static void main(String[] args) {

        ApplicationPrototype prototype = new Application("Games","1000","allFunction");
        Application human2 = (Application)prototype.copie();
        System.out.println(human2);

    }
}

interface ApplicationPrototype
{
    ApplicationPrototype copie();
}

class Application implements ApplicationPrototype
{
    public String name;
    public String price;
    public String function;

    public Application(String name, String price, String function) {
        this.name = name;
        this.price = price;
        this.function = function;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", function='" + function + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public ApplicationPrototype copie()
    {
        return  new Application(name,price,function);
    }
}