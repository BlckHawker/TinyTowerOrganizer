package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.concurrent.atomic.AtomicBoolean;

public class MenuScene {
    static VBox menu;
    static Button addBitizenButton, deleteBitizenButton, wipeBitizensButton, addJobFloorButton, addResidentFloorButton, deleteJobFloorButton, deleteResidentFloor, wipeFloorsButton, updateEmployment, showTowerButton, fireAllBitizensButton, showBitizenButton;


    public static Scene getMenu()
    {
        addBitizenButton = new Button("Add Bitizen"); //Add a bitizen to the game
        deleteBitizenButton = new Button("Delete Bitizen"); //deletes a bitizen from the game
        wipeBitizensButton = new Button("Wipe Bitizens"); //deletes all bitizens from the game
        addJobFloorButton = new Button("Add Job Floor"); //add a job floor to the game
        addResidentFloorButton = new Button("Add Resident Floor"); //adds a resident floor to the game
        deleteJobFloorButton = new Button("Delete Job Floor"); //deletes a job floor
        deleteResidentFloor = new Button("Delete Resident Floor"); //deletes a resident floor
        wipeFloorsButton = new Button("Wipe Floors"); //get rids of all floors from the game (can't have any bitizens in the game)
        updateEmployment = new Button("Update Employment"); //sorts the bitizens employment
        showTowerButton = new Button("Show Tower"); //show a list of the tower floors
        fireAllBitizensButton = new Button("Fire All Bitizens"); //Makes all bitizens unemployed
        showBitizenButton = new Button("Show Bitizens"); //shows a Bitizen's name, stats, employment, and residents based on a choiceBox


        addBitizenButton.setOnAction(e ->
        {
            if(Main.bitizens.size() == Main.residentFloors.size() * 5)
                Alert.display("No space", "There is no space to add a Bitizen");
            else
                Main.window.setScene(AddBitizenScene.getAddBitizenScene());
        });

        addResidentFloorButton.setOnAction(e -> Main.window.setScene(AddResidentFloorScene.AddResidentFloorScene()));

        addJobFloorButton.setOnAction(event -> Main.window.setScene(AddJobFloorScene.getAddAddJobFloorScene()));

        fireAllBitizensButton.setOnAction(event ->
        {
            for(int i = 0; i < Main.bitizens.size(); i++)
                Main.bitizens.get(i).job = JobFloor.FloorName.UNEMPLOYED;

            for(int i = 0; i < Main.jobFloors.size(); i++)
                Main.jobFloors.get(i).employeeNum = 0;

            Alert.display("","All bitizens fired");
        });

        showTowerButton.setOnAction(e ->
        {
            System.out.println("Show Tower Button Clicked");

            if(Main.residentFloors.isEmpty() && Main.jobFloors.isEmpty())
                Alert.display("No floors", "There are no floors to show");

            else
               Main.window.setScene(ShowTowerScene.getShowTowerScene());
        });

        updateEmployment.setOnAction(e ->
        {
            UpdateEmploymentScene.updateEmploymentScene();
            Alert.display("","Employment updated");
        });

        menu = new VBox(10);

        menu.setAlignment(Pos.CENTER);

        menu.getChildren().addAll(addResidentFloorButton, deleteResidentFloor, addJobFloorButton, deleteJobFloorButton, wipeFloorsButton, addBitizenButton, deleteBitizenButton, wipeBitizensButton, updateEmployment, fireAllBitizensButton, showTowerButton, showBitizenButton);

        return new Scene(menu);
    }


}
