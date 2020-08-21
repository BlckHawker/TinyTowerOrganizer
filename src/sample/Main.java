package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Main extends Application
{
    static Stage window;

    static ArrayList <Bitizen> bitizens;
    static ArrayList <ResidentFloor> residentFloors;
    static ArrayList <JobFloor> jobFloors;
    static int floorNum = 1;


    @Override
    public void start(Stage primaryStage) throws Exception{
        bitizens = new ArrayList<>();
        residentFloors = new ArrayList<>();
        jobFloors = new ArrayList<>();
        window = primaryStage;
        window.setScene(MenuScene.getMenu());
        window.show();
    }

    //finds the index of the elements that has the targeted floorName for resident floors
    public static int findResidentFloorName(ResidentFloor.FloorName floorName)
    {
        for(int i = 0; i < residentFloors.size(); i++)
            if(residentFloors.get(i).floorName == floorName)
                return i;

        return -1;
    }

    //finds the index of the elements that has the targeted floorName for resident floors
    public static int findJobFloorName(JobFloor.FloorName floorName)
    {
        for(int i = 0; i < jobFloors.size(); i++)
            if(jobFloors.get(i).floorName == floorName)
                return i;

        return -1;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
