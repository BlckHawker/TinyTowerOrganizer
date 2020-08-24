package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import static sample.ResidentFloor.FloorName.*;

public class AddResidentFloorScene {
    static ScrollPane scrollPane;
    static VBox menu;
    static HBox residentHBox;
    static Label residentLabel;
    static ChoiceBox<ResidentFloor.FloorName> residentFloorChoiceBox;
    static Button addButton, backButton;


    public static Scene AddResidentFloorScene()
    {
        scrollPane = new ScrollPane();

        menu = new VBox(10);

        menu.setAlignment(Pos.CENTER);

        residentHBox = new HBox(10);
        residentLabel = new Label("Resident:");
        residentFloorChoiceBox = new ChoiceBox<>();

        residentFloorChoiceBox.getItems().addAll(ANTI_GRAV, AQUATIC, ARTIC, ART_DECO, BACHELOR, BAYCREST, BEACH, BIRCHSIDE, BITCRAFT, BRIDGEVIEW, BRIGHTPOINT, BROADLEAF, BUBBLESOAK, BUTTERFLY, CAMPING, CAPSULE, CARMINE, CAVERN, CHATEAU, CLUB, COLLEGE, CONTEMPO, CORNER, COTTAGE, CUPID, DEVONSHIRE, DOVER, DRAGON, ECLECTIC, EGYPTIAN, EMPEROR, ESTATE, FAWLTY, FIFTIES, GARAGE, GARDEN, GLENDALE, GOLDCREEK, GOTHIC, GREEK, GREENWOOD, GROOVY, HACIENDA, HIFI, HIGH_TECH, HOLIDAY, HONEY, ISLAND, IVYMOSS, LODGE, LOFT, LOTUS, LOW_RENT, MAGIC, MAPLETON, MESA, MILLSPRING, MISMATCH, MISTMONT, MODERNA, NERD_CAVE, OVERGROWN, PARTY, PENTHOUSE, PET, PIANO, PINEHURST, PLAINLAKE, PLUMBROOK, POP_ART, REEF, REGAL, RELAX, RIDGEMILL, ROMAN, RUSTIC, SAFARI, SANTA_FE, SEVENTIES, SHIP, SILVERWELL, SPACE, SPRINGFIELD, STONECREST, STORAGE, SUBMARINE, SUNSET, SWEETSIDE, TEMPLE, THEATER, TIKI, TUSCANA, WESTGROVE, ZEN);
        residentFloorChoiceBox.setValue(ANTI_GRAV);

        residentHBox.getChildren().addAll(residentLabel, residentFloorChoiceBox);

        addButton = new Button("Add");

        addButton.setOnAction(event ->
        {
            boolean flag = true;

            for(int i = 0; i < Main.residentFloors.size(); i++)
            {
                if(Main.residentFloors.get(i).floorName == residentFloorChoiceBox.getValue())
                {
                    flag = false;
                    Alert.display("Duplicate Floor", "There is already a " + residentFloorChoiceBox.getValue() + " floor");
                    break;
                }
            }

            if(flag)
            {
                Main.residentFloors.add(new ResidentFloor(residentFloorChoiceBox.getValue()));
                Alert.display("", residentFloorChoiceBox.getValue() + " has been built");
            }
        });

        backButton = new Button("Back");

        backButton.setOnAction(event -> Main.window.setScene(MenuScene.getMenu()));


        menu.getChildren().addAll(residentHBox, addButton, backButton);

        scrollPane.setContent(menu);

        return new Scene(scrollPane);
    }
}
