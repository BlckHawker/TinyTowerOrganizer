/*
    Has 6 buttons:
    Add Bitzen - adds a person to the game, there must be at least one resident floor that has an empty room to add them
    Delete Bitzen - removes a person from the game, will give a warning where that person works
    Wipe Bitzens - clears the list of people from the game
    Add floor - adds a different floor from the game
    Wipe Floors - clears the list of floors from the game
*/
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {
    @FXML
    Button addBitzenButton, deleteBitzenButton, wipeBitzensButton, addFloorButton, deleteFloorButton, wipeFloorsButton;

    public void addBitzenButtonClicked()
    {
        System.out.println("Add Bitzen");
    }

    public void deleteBitzenButtonClicked()
    {
        System.out.println("Delete Bitzen");
    }

    public void wipeBitzensButtonClicked()
    {
        System.out.println("Wipe Bitzens");
    }

    public void addFloorButtonClicked()
    {
        System.out.println("Add Floor");
    }

    public void deleteFloorButtonClicked()
    {
        System.out.println("Delete Floor");
    }

    public void wipeFloorsButtonClicked()
    {
        System.out.println("Wipe Floors");
    }
}
