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
    static Button addBitizenButton, deleteBitizenButton, wipeBitizensButton, addJobFloorButton, addResidentFloorButton, deleteJobFloorButton, deleteResidentFloor, wipeFloorsButton, updateEmployment, showTowerButton;


    public static Scene getMenu()
    {
        addBitizenButton = new Button("Add Bitzen"); //Add a bitizen to the game
        deleteBitizenButton = new Button("Delete Bitizen"); //deletes a bitizen from the game
        wipeBitizensButton = new Button("Wipe Bitizens"); //deletes all bitizens from the game
        addJobFloorButton = new Button("Add Job Floor"); //add a job floor to the game
        addResidentFloorButton = new Button("Add Resident Floor"); //adds a resident floor to the game
        deleteJobFloorButton = new Button("Delete Job Floor"); //deletes a job floor
        deleteResidentFloor = new Button("Delete Resident Floor"); //deletes a resident floor
        wipeFloorsButton = new Button("Wipe Floors"); //get rids of all floors from the game (can't have any bitizens in the game)
        updateEmployment = new Button("Update Employment"); //sorts the bitizens employment
        showTowerButton = new Button("Show Tower"); //show a list of the tower floors


        addBitizenButton.setOnAction(e ->
        {
            boolean flag = true;

            if(Main.bitizens.size() == Main.residentFloors.size() * 5)
            {
                Alert.display("No space", "There is no space to add a Bitizen");
                flag = false;
            }

            if(flag)
                Main.window.setScene(AddBitizenScene.getAddBitizenScene());
        });

        addResidentFloorButton.setOnAction(e ->
        {
            Main.window.setScene(AddResidentFloorScene.AddResidentFloorScene());
        });

        menu = new VBox(10);

        menu.setAlignment(Pos.CENTER);

        menu.getChildren().addAll(addBitizenButton, deleteBitizenButton, wipeBitizensButton, addResidentFloorButton, addJobFloorButton, deleteJobFloorButton, deleteResidentFloor, wipeFloorsButton, updateEmployment, showTowerButton);

        return new Scene(menu);
    }


}
