package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application
{
    public static enum Food
    {
        Airline_Food,
        Asian_Cuisine,
        Bakery,
        BBQ_Place,
        Burrito_Bar,
        Cheese_Shop,
        Coffee_House,
        Diner,
        Donut_Shop,
        Fancy_Cuisine,

        };

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
