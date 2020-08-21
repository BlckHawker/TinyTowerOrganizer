package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


import static sample.JobFloor.FloorName.*;

public class AddBitizenScene {
    static Button addButton;
    static Button backButton;

    static TextField nameTextField;

    static ChoiceBox <ResidentFloor.FloorName> residentFloorNameChoiceBox;
    static ChoiceBox <JobFloor.FloorName> dreamJobChoiceBox;
    static ChoiceBox <Integer> foodSkillChoiceBox, retailSkillChoiceBox, recreationSkillChoiceBox, creativeSkillChoiceBox, serviceSkillChoiceBox;

    static Label foodSkillLabel, retailSkillLabel, recreationSkillLabel, creativeSkillLabel, serviceSkillLabel, residentLabel, dreamJobLabel;

    static HBox foodSkillHBox, retailSkillHBox,  recreationSkillHBox, creativeSkillHBox, serviceSkillHBox, residentHBox, dreamJobHBox;


    public static Scene getAddBitizenScene()
    {
        VBox menu = new VBox(10);

        //the name of the bitizen
        nameTextField = new TextField();
        nameTextField.setPromptText("Enter new Bitizen's name");

        //Skills
        foodSkillLabel = new Label("Food Skill:");
        retailSkillLabel = new Label("Retail Skill:");
        recreationSkillLabel = new Label("Recreation Skill");
        creativeSkillLabel = new Label("Creative Skill");
        serviceSkillLabel = new Label("Service Skill");

        foodSkillChoiceBox = new ChoiceBox<>();
        retailSkillChoiceBox = new ChoiceBox<>();
        recreationSkillChoiceBox = new ChoiceBox<>();
        creativeSkillChoiceBox = new ChoiceBox<>();
        serviceSkillChoiceBox = new ChoiceBox<>();


        for(int i = 0; i < 10; i++)
        {
            foodSkillChoiceBox.getItems().add(i);
            retailSkillChoiceBox.getItems().add(i);
            recreationSkillChoiceBox.getItems().add(i);
            creativeSkillChoiceBox.getItems().add(i);
            serviceSkillChoiceBox.getItems().add(i);
        }

        foodSkillChoiceBox.setValue(0);
        retailSkillChoiceBox.setValue(0);
        recreationSkillChoiceBox.setValue(0);
        creativeSkillChoiceBox.setValue(0);
        serviceSkillChoiceBox.setValue(0);

        foodSkillHBox = new HBox(10);
        foodSkillHBox.getChildren().addAll(foodSkillLabel, foodSkillChoiceBox);

        retailSkillHBox = new HBox(10);
        retailSkillHBox.getChildren().addAll(retailSkillLabel, retailSkillChoiceBox);

        recreationSkillHBox = new HBox(10);
        recreationSkillHBox.getChildren().addAll(recreationSkillLabel,recreationSkillChoiceBox);

        creativeSkillHBox = new HBox(10);
        creativeSkillHBox.getChildren().addAll(creativeSkillLabel, creativeSkillChoiceBox);

        serviceSkillHBox = new HBox(10);
        serviceSkillHBox.getChildren().addAll(serviceSkillLabel, serviceSkillChoiceBox);

        //add all the resident floors that exist in the game
        residentLabel = new Label("Resident:");

        residentFloorNameChoiceBox = new ChoiceBox<>();
        for(int i = 0; i < Main.residentFloors.size(); i++)
            residentFloorNameChoiceBox.getItems().add(Main.residentFloors.get(i).floorName);
        residentFloorNameChoiceBox.setValue(Main.residentFloors.get(0).floorName);

        residentHBox = new HBox(10);

        residentHBox.getChildren().addAll(residentLabel, residentFloorNameChoiceBox);

        //the dream job of the bitizen
        dreamJobChoiceBox.getItems().addAll
        (AD_AGENCY, AIRLINE_FOOD, ANIMATION_STUDIO, AQUARIUM, ARCADE, ARCHERY_RANGE, ARCHTECT_OFFICE, ART_STUDIO, ASIAN_CUISINE, AUTO_DEALER, BAKERY, BANK, BARBER_SHOP, BBQ_PLACE, BIKE_SHOP, BILLIARD_HALL, BITBOOK, BLING_JEWELERS, BOOK_STORE, BOWLING_ALLEY, BOXING_GYM, BRICK_STORE, BROADWAY_THEATRE, BURRITO_BAR, CAKE_STUDIO, CANDLE_SHOP, CANDY_SHOPPE, CASINO, CHEESE_SHOP, CHOCOLATIER, CINEPLEX, CIRCUS, CLOCKMAKER, COFFEE_HOUSE, JobFloor.FloorName.COLLEGE, COMEDY_CLUB, COMIC_STORE, COOKIE_SHOP, COSTUME_SHOP, COURTHOUSE, CREATIVE_INK, CYBER_CAFE, DANCE_STUDIO, DAY_SPA, DENTISTS_OFFICE, DEVICE_REPAIR, DINER, DOCTORS_OFFICE, DOGGY_DAYCARE, DONUT_SHOP, FABRIC_SHOP, FANCY_CUISINE, FASHION_STUDIO, FILM_STUDIO, FIRE_STATION, FLORAL_STUDIO, FORTUNE_TELLER, FROZEN_YOGURT, FURNITURE_SHOP, GAME_STORE, GAME_STUDIO, GLASS_STUDIO, GOLF_SIM, GRAPHIC_DESIGN, GROCERY_STORE, HAT_SHOP, HAUNTED_HOUSE, HEALTH_CLUB, HOME_SUPPLY, HOT_DOG_JOINT, INDOOR_SKYDIVING, ITIALIAN_FOOD, JEWELERY_STORE, JOEY_BITTON, KARAOKE_CLUB, LABORATORY, LAUNDROMAT, LAW_OFFICES, LEGIT_WATCHES, LOTUS_HOUSE, MAKERSPACE, MAPPLE_STORE, MARTIAL_ARTS, MECHANIC, MENS_FASHION, METAL_STUDIO, MEXICAN_FOOD, MINI_GOLF, MODEL_TRAINS, MOROCCAN_CUISINE, MUSEUM, MUSIC_STORE, NATIVE_ART_STUDIO, NIGHT_CLUB, OPTOMETRIST, PAINTBALL_ARENA, PANCAKE_HOUSE, PARK, PET_SHOP, PHARMACY, PHOTO_STUDIO, PIZZA_PLACE, PLANETARIUM, PLANT_NURSERY, PLUMBER, POTTERY_STUDIO, PRIVATE_EYE, PUB, RACQUETBALL, RECORD_SHOP, RECORDING_STUDIO, RECYCLING, ROBOT_STORE, ROCK_CLIMBING, ROCK_DINER, SCOOPS, SCULPTING_STUDIO, SEAFOOD, SECURITY_OFFICE, SHOE_STORE, SHRIMP_BUFFET, SHIP_AND_PRINT, SURF_SHOP, SKY_BURGER, SMOOTHIE_SHOP, SODA_BREWERY, SOFTWARE_STUDIO, SPLASH_ZONE, STABLES, STOCK_EXCHANGE, STYLE_SALON, SUB_SHOP, SUPERHERO_LAB, SUSHI_BAR, TATTO_PARLOR, TAILOR, TEA_HOUSE, TECH_STORE, JobFloor.FloorName.THEATER, TIGER_MAGIC, TOURIST_TRAP, TRAVEL_AGENCY, TUTORING_CENTER, TV_STUDIO, VEGAN_FOOD, WARREN_BUFFET, WAX_MUSEUM, WEDDING_CHAPEL, WOMENS_FASHION, WOOD_SHOP, VIDEO_RENTAL, VOLLEYBALL_CLUB);

        dreamJobChoiceBox.setValue(AIRLINE_FOOD);

        dreamJobLabel = new Label("Dream Job:");

        dreamJobHBox = new HBox(10);

        dreamJobHBox.getChildren().addAll(dreamJobLabel, dreamJobChoiceBox);

        //the button that confirms and makes the bitizen
        addButton = new Button("Add");

        addButton.setOnAction(e ->
        {
            boolean flag = true; //if everything is okay for the bitizen to be added

            //if the name of the bitizen is blank
            if(nameTextField.getText().isEmpty())
            {
                flag = false;

                Alert.display("No name", "The bitizen must have a name");
            }

            //can't have duplicate name

            for(int i = 0; i < Main.bitizens.size(); i++)
            {
                if (Main.bitizens.get(i).name.equals(nameTextField.getText()))
                {
                    flag = false;
                    Alert.display("Duplicate Name", "There is already a bitizen named " + nameTextField.getText());
                    break;
                }
            }

            //if there is room to add a bitizen
            if(flag && Main.bitizens.size() >= Main.residentFloors.size() * 5)
            {
                flag = false;
                Alert.display("No room", "There's no room to add another bitizen");
            }

            //if there is any space on that floor
            if(flag && Main.residentFloors.get(Main.findResidentFloorName(residentFloorNameChoiceBox.getValue())).residentsNum >= 5)
            {
                flag = false;
                Alert.display("No room", "There's no room to add another bitizen on this floor");
            }


            if(flag)
            {
                Main.bitizens.add(new Bitizen(nameTextField.getText(), foodSkillChoiceBox.getValue(), retailSkillChoiceBox.getValue(), recreationSkillChoiceBox.getValue(), creativeSkillChoiceBox.getValue(), serviceSkillChoiceBox.getValue(), residentFloorNameChoiceBox.getValue(), dreamJobChoiceBox.getValue()));
                Main.residentFloors.get(Main.findResidentFloorName(residentFloorNameChoiceBox.getValue())).residentsNum ++;

                Alert.display("",nameTextField.getText() + " has been added to " + residentFloorNameChoiceBox.getValue());
            }
        });

        backButton = new Button("Back");

        backButton.setOnAction(e -> Main.window.setScene(MenuScene.getMenu()));

        menu.getChildren().addAll(nameTextField,residentFloorNameChoiceBox,addButton,backButton);

        return new Scene(menu);
    }
}
