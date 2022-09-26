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
        ButtonController butCon = new ButtonController();




        //Loop to add a bunch of button
        for(int i = 0; i < butCon.getGameHeight(); i++){                //Loop for the height
            butCon.msButtons[i] = new Button[butCon.getGameHeight()];   //Create a new array of buttons for the width
            for(int j =0; j< butCon.getGameWidth(); j++){               //Loop for the width
                int buttonClickI = i;
                int buttonClickJ = j;
                butCon.msButtons[i][j] = new Button();                  //Create a new button
                butCon.msButtons[i][j].relocate(i*30,j*30);       //Set the location of the button
                butCon.msButtons[i][j].setPrefSize(30,30);        //Set the size of the button
                butCon.msButtons[i][j].setOnAction(ActionEvent -> butCon.buttonClicked(buttonClickI,buttonClickJ)); //Set the button to be clickable
                root.getChildren().add(butCon.msButtons[i][j]);         //Add the button to the root

            }//End of inner loop gameWidth
        }//End of loop gameHeight





        stage.setTitle("Minesweeper");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}