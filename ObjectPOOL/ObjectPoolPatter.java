package com.company.ObjectPOOL;

import java.util.ArrayList;
import java.util.List;

public class ObjectPoolPatter {

    public static void main(String[] args) {

        ProgrammersData obj = ProgrammersData.getInstance();
        Resource obj1 = obj.getResource();
        System.out.println(obj1.getWeigh());
        Resource obj2= obj.getResource();
        System.out.println(obj2.getWeigh());
        obj.returnResource(obj1);
        System.out.println(obj.list.get(0).getWeigh());

    }
}
class Resource
{
    public int experience;
    Resource(int experience){this.experience=experience;}
    public void setWeigh(int experience) {
        this.experience = experience;
    }

    public int getWeigh() {
        return experience;
    }
}

class ProgrammersData
{
   public List<Resource>list;
   private static ProgrammersData instance;
    ProgrammersData(){
        instance =null;
        list = new ArrayList<>();
    };
    public static ProgrammersData getInstance()
    {
        if(instance==null) {

            instance= new ProgrammersData();
        }
        return  instance;
    }
    public Resource getResource() {
        if (list.isEmpty()) {
            return new Resource(10);
        } else {
            Resource resource = list.get(0);
            list.remove(0);
            return  resource;
        }
    }
        public void returnResource (Resource obj)
            {
                list.add(obj);
            }


}