package com.example.minesweeper;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ButtonController {//This class is used to control the buttons
    //Variables
    private int gameHeight = 8; //Height of the game Should change to be configurable later
    private int gameWidth = 8;  //Width of the game Should change to be configurable later
    private int bombsPossible = 8; //Number of bombs possible to touch any given button
    //Objects
    Button[][] gameButtons = new Button[gameHeight][gameWidth];            //Two Dim Array of buttons for the game
    String[] bombsInRange = new String[bombsPossible];
    //Constructor
    public ButtonController(){
        for (int i = 0; i <bombsPossible; i++) {           //Loop to create the numbers for the bombs possible
            int currentInt = 1+i;
            bombsInRange[i] = ((Integer)currentInt).toString();
        }
    }//End of Constructor

    //Getters
    public int getGameHeight() {
        return gameHeight;
    }   //Returns the height of the game
    public int getGameWidth() {
        return gameWidth;
    }     //Returns the width of the game
    public int getBombsPossible() {
        return bombsPossible;
    } //Returns the number of bombs possible
    //Setters
    public void setGameHeight(int gameHeight) {
        this.gameHeight = gameHeight;
    }
    public void setGameWidth(int gameWidth) {
        this.gameWidth = gameWidth;
    }
    public void setBombsPossible(int bombsPossible) {
        this.bombsPossible = bombsPossible;
    }

    //Methods
    public void buttonClicked(int i, int j){            //This method decides what to do when a button is clicked
        gameButtons[i][j].setText(printRandomBomb());
        gameButtons[i][j].setDisable(true);
    }
    public String printRandomBomb(){                    //Method is for testing purposes Need to be removed later
        int randomNum = (int)(Math.random() * bombsPossible);   //Get a random number between 0 and bombsPossible
        return (bombsInRange[randomNum]);                       //Print out the random number
    }
    public void setBoredSize(){
        //TODO
        /** Classic Minesweeper is 8x8
         *  Easy Minesweeper is a 9x9
         *  Medium Minesweeper is a 16x16
         *  Hard Minesweeper is a 30x16
         *  May not need this method
         */
    }
    public void bombCreator(){                       //This method randomizes the bombs on the board
        //TODO
        /** Will need to add a check to make sure that the bombs are not placed on top of each other
         *  Would be nice to change the color of the button to red when a bomb is placed
         *  Need to add a way to display "Game Over" when a bomb is clicked
         *  Classic Minesweeper has 8 bombs on the board
         *  Easy Minesweeper has 10 bombs on the board
         *  Medium Minesweeper has 40 bombs on the board
         *  Hard Minesweeper has 99 bombs on the board
         *  May not need this method
         */
        int randomHeight = 0;
        int randomWidth = 0;
        for (int i = 0; i < bombsPossible; i++) {        //Loop to randomize the bombs
            randomHeight = (int)(Math.random() * 8);   //Get a random number between 0 and gameHeight
            randomWidth = (int)(Math.random() * 8);     //Get a random number between 0 and gameWidth

            //on action of button end game
            int finalRandomWidth = randomWidth;
            int finalRandomHeight = randomHeight;
            gameButtons[randomHeight][randomWidth].setOnAction(ActionEvent -> {
                gameButtons[finalRandomHeight][finalRandomWidth].setText("B");
                Text gameOver = new Text("Game Over");
                gameOver.setFill(Color.RED);
                //Need to add a way to end the game
            });


        }
    }
    public void checkForBombs(){                       //This method checks for bombs around the button
        //TODO
        //This method should check for bombs in any of the 8 directions around the button

    }
    public void checkForWin(){                         //This method checks for a win
        //TODO
    }
    public void checkForLoss(){                        //This method checks for a loss
        //TODO
    }

}//Closing ButtonController
