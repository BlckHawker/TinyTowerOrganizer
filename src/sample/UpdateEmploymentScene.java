package sample;

import javafx.scene.Scene;

import java.util.ArrayList;

public class UpdateEmploymentScene
{

    public static void updateEmploymentScene()
    {
        //sort everyone by their skill sum from worst to best
        for(int i = 0; i < Main.bitizens.size() - 1; i++)
            for(int j = i + 1; j < Main.bitizens.size(); j++)
            {
                if(Main.bitizens.get(i).skillSum > Main.bitizens.get(j).skillSum)
                {
                    Bitizen temp = Main.bitizens.get(i);
                    Main.bitizens.set(i, Main.bitizens.get(j));
                    Main.bitizens.set(j,temp);
                }
            }


        //firing everyone
        for(int i = 0; i < Main.bitizens.size(); i++)
            Main.bitizens.get(i).job = JobFloor.FloorName.UNEMPLOYED;

        for(int i = 0; i < Main.jobFloors.size(); i++)
            Main.jobFloors.get(i).employeeNum = 0;

        //giving who's dream jobs are built employment first
        for (int i = 0; i < Main.bitizens.size(); i++)
        {
            for(int j = 0; j < Main.jobFloors.size(); j++)
            {
                if(Main.bitizens.get(i).dreamJob == Main.jobFloors.get(j).floorName && Main.jobFloors.get(j).employeeNum < 3)
                {
                    Main.bitizens.get(i).job = Main.bitizens.get(i).dreamJob;
                    Main.jobFloors.get(j).employeeNum++;
                }
            }
        }



        //going through the list, hire a person based by their best skill, if not possible, go to the next one
        for(int i = 0; i < Main.bitizens.size(); i++)
        {
            for(int j = 0; j < Main.jobFloors.size(); j++)
            {
                for(int k = 0; k < 5; k++)
                {
                    if(Main.bitizens.get(i).job != JobFloor.FloorName.UNEMPLOYED && Main.jobFloors.get(i).employeeNum < 3 && Main.jobFloors.get(i).trait == getTrait(Main.bitizens.get(i)).get(k))
                    {
                        Main.bitizens.get(i).job = Main.jobFloors.get(i).floorName;
                        Main.jobFloors.get(i).employeeNum++;
                        break;
                    }
                }
            }
        }


    }

    public static ArrayList<JobFloor.Trait> getTrait(Bitizen bitizen)
    {
        ArrayList<JobFloor.Trait> traitList = new ArrayList<>();

        for(int i = 0; i < bitizen.list.size(); i++)
        {
            switch (bitizen.list.get(i).name)
            {
                case "food":
                    traitList.add(JobFloor.Trait.FOOD);
                    break;
                case "retail":
                    traitList.add(JobFloor.Trait.RETAIL);
                    break;
                case "recreation":
                    traitList.add(JobFloor.Trait.RECREATION);
                    break;
                case "creative":
                    traitList.add(JobFloor.Trait.CREATIVE);
                    break;
                case "service":
                    traitList.add(JobFloor.Trait.SERVICE);
            }
        }
        return traitList;
    }
}
