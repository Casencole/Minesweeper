package com.example.minesweeper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Minesweeper extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // FXMLLoader fxmlLoader = new FXMLLoader(MineSweeper.class.getResource("hello-view.fxml")); Should not need
        //Creating the window stuff
        Group root = new Group();
        Scene scene = new Scene(root);
        ButtonController bC = new ButtonController();   //Most Controls for the Buttons
        MenuController mC = new MenuController();       //Most Controls for the Menu

        //Asking for the game mode
        mC.setGameMode("Easy");
        for(int h = 0; h < bC.getGameHeight(); h++){                //Loop for the height = h
            bC.gameButtons[h] = new Button[bC.getGameHeight()];       //Create a new array of buttons for the width = w
            for(int w =0; w< bC.getGameWidth(); w++){               //Loop for the width
                int buttonClickH = h;
                int buttonClickW = w;
                bC.gameButtons[h][w] = new Button();                  //Create a new button
                bC.gameButtons[h][w].relocate(h*30,w*30);       //Set the location of the button
                bC.gameButtons[h][w].setPrefSize(30,30);        //Set the size of the button
                bC.gameButtons[h][w].setOnAction(ActionEvent -> bC.buttonClicked(buttonClickH,buttonClickW)); //Set the button to be clickable
                root.getChildren().add(bC.gameButtons[h][w]);         //Add the button to the root
            }//End of inner loop gameWidth
        }//End of loop gameHeight
        bC.bombCreator();




        stage.setTitle("Minesweeper");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}