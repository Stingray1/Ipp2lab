package com.company.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vadim on 11/15/16.
 */
public class Composite {

    public static void main(String[] args) {
        Team team = new Team();
        Team team1 = new Team();

        Developer firstJavaDeveloper = new javaDevelopper();
        Developer secondJavaDeveloper = new javaDevelopper();
        Developer cppDeveloper = new CppDevelopper();

        team1.addDeveloper(firstJavaDeveloper);
        team1.addDeveloper(secondJavaDeveloper);


        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);
        team.addDeveloper(team1);
        team.writeCode();



    }

}
interface Developer {
    public void writeCode();
}
class javaDevelopper implements Developer{
    public void writeCode()
    {
        System.out.println("Java developer writes java code");
    }
}
class CppDevelopper implements Developer
{
    public void writeCode()
        {
        System.out.println("cpp developer writes c++ code");
        }
}

class Team implements Developer {
    private List<Developer> developers = new ArrayList<Developer>();

    @Override
    public void writeCode() {
        System.out.println("team create project");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developers);
    }


}


