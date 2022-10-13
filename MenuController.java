package com.example.minesweeper;

import javafx.scene.Group;
import javafx.scene.control.Button;

public class MenuController {
    //Objects
    ButtonController buttonController = new ButtonController();


    //Methods
    public void setGameMode(String gameMode) {
        if(gameMode.equals("Easy")){
            buttonController.setGameHeight(8);
            buttonController.setGameWidth(8);
            buttonController.setBombsPossible(8);
        }else if(gameMode.equals("Medium")){
            buttonController.setGameHeight(16);
            buttonController.setGameWidth(16);
            buttonController.setBombsPossible(40);
        }else if(gameMode.equals("Hard")){
            buttonController.setGameHeight(16);
            buttonController.setGameWidth(30);
            buttonController.setBombsPossible(99);
        }
    }
//    public void createGame() {
//        for(int h = 0; h<gameHeight; h++){                //Loop for the height = h
//            mcBC.gameButtons[h] = new Button[gameHeight];       //Create a new array of buttons for the width = w
//            for(int w =0; w< gameWidth; w++){               //Loop for the width
//                int buttonClickH = h;
//                int buttonClickW = w;
//                mcBC.gameButtons[h][w] = new Button();                  //Create a new button
//                mcBC.gameButtons[h][w].relocate(h*30,w*30);       //Set the location of the button
//                mcBC.gameButtons[h][w].setPrefSize(30,30);        //Set the size of the button
//                mcBC.gameButtons[h][w].setOnAction(ActionEvent -> mcBC.buttonClicked(buttonClickH,buttonClickW)); //Set the button to be clickable
//                root.getChildren().add(mcBC.gameButtons[h][w]);         //Add the button to the root
//            }//End of inner loop gameWidth
//        }//End of loop gameHeight
//    }
}
