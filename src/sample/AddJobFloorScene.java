package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;

import static sample.JobFloor.FloorName.*;
import static sample.JobFloor.FloorName.VOLLEYBALL_CLUB;

public class AddJobFloorScene {
    static Button addFloorButton, backButton;
    static ChoiceBox <JobFloor.FloorName> jobFloorChoiceBox;
    static VBox menu;

    public static Scene getAddAddJobFloorScene()
    {
        addFloorButton = new Button("Add");
        backButton = new Button("Back");

        jobFloorChoiceBox = new ChoiceBox<>();

        jobFloorChoiceBox.getItems().addAll(AD_AGENCY, AIRLINE_FOOD, ANIMATION_STUDIO, AQUARIUM, ARCADE, ARCHERY_RANGE, ARCHTECT_OFFICE, ART_STUDIO, ASIAN_CUISINE, AUTO_DEALER, BAKERY, BANK, BARBER_SHOP, BBQ_PLACE, BIKE_SHOP, BILLIARD_HALL, BITBOOK, BLING_JEWELERS, BOOK_STORE, BOWLING_ALLEY, BOXING_GYM, BRICK_STORE, BROADWAY_THEATRE, BURRITO_BAR, CAKE_STUDIO, CANDLE_SHOP, CANDY_SHOPPE, CASINO, CHEESE_SHOP, CHOCOLATIER, CINEPLEX, CIRCUS, CLOCKMAKER, COFFEE_HOUSE, JobFloor.FloorName.COLLEGE, COMEDY_CLUB, COMIC_STORE, COOKIE_SHOP, COSTUME_SHOP, COURTHOUSE, CREATIVE_INK, CYBER_CAFE, DANCE_STUDIO, DAY_SPA, DENTISTS_OFFICE, DEVICE_REPAIR, DINER, DOCTORS_OFFICE, DOGGY_DAYCARE, DONUT_SHOP, FABRIC_SHOP, FANCY_CUISINE, FASHION_STUDIO, FILM_STUDIO, FIRE_STATION, FLORAL_STUDIO, FORTUNE_TELLER, FROZEN_YOGURT, FURNITURE_SHOP, GAME_STORE, GAME_STUDIO, GLASS_STUDIO, GOLF_SIM, GRAPHIC_DESIGN, GROCERY_STORE, HAT_SHOP, HAUNTED_HOUSE, HEALTH_CLUB, HOME_SUPPLY, HOT_DOG_JOINT, INDOOR_SKYDIVING, ITIALIAN_FOOD, JEWELERY_STORE, JOEY_BITTON, KARAOKE_CLUB, LABORATORY, LAUNDROMAT, LAW_OFFICES, LEGIT_WATCHES, LOTUS_HOUSE, MAKERSPACE, MAPPLE_STORE, MARTIAL_ARTS, MECHANIC, MENS_FASHION, METAL_STUDIO, MEXICAN_FOOD, MINI_GOLF, MODEL_TRAINS, MOROCCAN_CUISINE, MUSEUM, MUSIC_STORE, NATIVE_ART_STUDIO, NIGHT_CLUB, OPTOMETRIST, PAINTBALL_ARENA, PANCAKE_HOUSE, PARK, PET_SHOP, PHARMACY, PHOTO_STUDIO, PIZZA_PLACE, PLANETARIUM, PLANT_NURSERY, PLUMBER, POTTERY_STUDIO, PRIVATE_EYE, PUB, RACQUETBALL, RECORD_SHOP, RECORDING_STUDIO, RECYCLING, ROBOT_STORE, ROCK_CLIMBING, ROCK_DINER, SCOOPS, SCULPTING_STUDIO, SEAFOOD, SECURITY_OFFICE, SHOE_STORE, SHRIMP_BUFFET, SHIP_AND_PRINT, SURF_SHOP, SKY_BURGER, SMOOTHIE_SHOP, SODA_BREWERY, SOFTWARE_STUDIO, SPLASH_ZONE, STABLES, STOCK_EXCHANGE, STYLE_SALON, SUB_SHOP, SUPERHERO_LAB, SUSHI_BAR, TATTO_PARLOR, TAILOR, TEA_HOUSE, TECH_STORE, JobFloor.FloorName.THEATER, TIGER_MAGIC, TOURIST_TRAP, TRAVEL_AGENCY, TUTORING_CENTER, TV_STUDIO, VEGAN_FOOD, WARREN_BUFFET, WAX_MUSEUM, WEDDING_CHAPEL, WOMENS_FASHION, WOOD_SHOP, VIDEO_RENTAL, VOLLEYBALL_CLUB);

        jobFloorChoiceBox.setValue(AD_AGENCY);

        addFloorButton.setOnAction(event ->
        {
            boolean flag = true;

            for(int i = 0; i < Main.jobFloors.size(); i++)
                if(jobFloorChoiceBox.getValue() == Main.jobFloors.get(i).floorName)
                {
                    flag = false;
                    Alert.display("Duplicate Floor", jobFloorChoiceBox.getValue() + " is already built");
                    break;
                }

            if (flag)
            {
                Main.jobFloors.add(new JobFloor(jobFloorChoiceBox.getValue()));
                Alert.display("",jobFloorChoiceBox.getValue() + " added");
            }
        });

        backButton.setOnAction(event -> Main.window.setScene(MenuScene.getMenu()));

        menu = new VBox(10);

        menu.getChildren().addAll(jobFloorChoiceBox, addFloorButton, backButton);

        return new Scene(menu);
    }
}
