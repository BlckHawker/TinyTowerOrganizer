package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class ShowTowerScene {
    static Button backButton;
    static Label label;
    static String str;
    static VBox menu;
    public static Scene getShowTowerScene() {
        backButton = new Button("Back");

        backButton.setOnAction(event -> Main.window.setScene(MenuScene.getMenu()));

        sortResidentFloors();
        sortAllJobFloors();

        int floorNum = Main.residentFloors.size() + Main.jobFloors.size();

        str = "";

        for (int i = 0; i < Main.residentFloors.size(); i++)
            str += (floorNum - i + 1) + ": " + Main.residentFloors.get(i).floorName + "\n";


        for(int i = 0; i < Main.jobFloors.size(); i++)
            str += (floorNum + 1 - i - Main.residentFloors.size()) + ": " + Main.jobFloors.get(i).floorName + "\n";

        str += "1: Lobby";

        label = new Label(str);

        menu = new VBox(10);

        menu.setAlignment(Pos.CENTER);

        menu.getChildren().addAll(label,backButton);

        return new Scene(menu);
    }

    public static void sortResidentFloors() {
        if (Main.residentFloors.size() == 1)
            return;

        for (int i = 0; i < Main.residentFloors.size(); i++)
            for (int j = i + 1; j < Main.residentFloors.size(); j++)
                if (Main.residentFloors.get(i).floorName.compareTo(Main.residentFloors.get(j).floorName) > 0)
                {
                    ResidentFloor temp = Main.residentFloors.get(i);
                    Main.residentFloors.set(i, Main.residentFloors.get(j));
                    Main.residentFloors.set(j, temp);
                }

    }

    public static void sortAllJobFloors() {
        ArrayList<JobFloor> foodFloors = new ArrayList<>();
        ArrayList<JobFloor> retailFloors = new ArrayList<>();
        ArrayList<JobFloor> recreationFloors = new ArrayList<>();
        ArrayList<JobFloor> creativeFloors = new ArrayList<>();
        ArrayList<JobFloor> serviceFloors = new ArrayList<>();

        for (int i = 0; i < Main.jobFloors.size(); i++) {
            switch (Main.jobFloors.get(i).trait) {
                case FOOD:
                    foodFloors.add(Main.jobFloors.get(i));
                    break;
                case RETAIL:
                    retailFloors.add(Main.jobFloors.get(i));
                    break;
                case RECREATION:
                    recreationFloors.add(Main.jobFloors.get(i));
                    break;
                case CREATIVE:
                    creativeFloors.add(Main.jobFloors.get(i));
                    break;
                case SERVICE:
                    serviceFloors.add(Main.jobFloors.get(i));
                    break;
            }
        }

        Main.jobFloors.clear();

        Main.jobFloors.addAll(sortJobFloors(serviceFloors));
        Main.jobFloors.addAll(sortJobFloors(creativeFloors));
        Main.jobFloors.addAll(sortJobFloors(recreationFloors));
        Main.jobFloors.addAll(sortJobFloors(retailFloors));
        Main.jobFloors.addAll(sortJobFloors(foodFloors));
}

    public static ArrayList<JobFloor> sortJobFloors(ArrayList<JobFloor> list)
    {
        if (list.size() == 1 || list.size() == 0)
            return list;

        for(int i = 0; i < list.size(); i++)
            for(int j = i + 1; j < list.size(); j++)
                if(list.get(i).floorName.compareTo(list.get(j).floorName) > 0)
                {
                    JobFloor temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }

        return list;
    }
}
