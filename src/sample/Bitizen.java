package sample;

import javafx.scene.Scene;

import java.util.ArrayList;

public class Bitizen {



    String name; // the name of the bitizen
    ResidentFloor.FloorName apartment; //the floor where the bitizen lives
    JobFloor.FloorName job; //the floor the bitizen works on
    JobFloor.FloorName dreamJob; //the dream job for the bitizen
    Skill food, retail, recreation, creative, service;
    ArrayList <Skill> list; // a list of the skills from best to worse
    int skillSum;

    public Bitizen(String name, int foodNum, int retailNum, int recreationNum, int creativeNum, int serviceNum, ResidentFloor.FloorName apartment, JobFloor.FloorName dreamJob)
    {
        this.name = name;

        food = new Skill("food", foodNum);
        retail = new Skill("retail", retailNum);
        recreation = new Skill("recreation", recreationNum);
        creative = new Skill("creative", creativeNum);
        service = new Skill("service", serviceNum);

        this.dreamJob = dreamJob;

        list = sortSkills();

        this.apartment = apartment;

        job = JobFloor.FloorName.UNEMPLOYED;

        skillSum = foodNum + retailNum + recreationNum + creativeNum + serviceNum;
    }

    public void changeJob(JobFloor.FloorName job)
    {
        this.job = job;
    }

    public ArrayList<Skill> sortSkills()
    {
        ArrayList <Skill> list = new ArrayList<>();

        list.add(food);
        list.add(retail);
        list.add(recreation);
        list.add(creative);
        list.add(service);

        for(int i = 0; i < list.size() - 1; i++)
            for(int j = i + 1; j < list.size(); j++)
                if(list.get(i).num < list.get(j).num)
                {
                    Skill temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);
                }

        return list;
    }


    public class Skill
    {
        String name;
        int num;

        public Skill(String name, int num)
        {
           this.name = name;
           this.num = num;
        }
    }
}
