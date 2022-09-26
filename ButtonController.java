package com.example.minesweeper;

import javafx.scene.control.Button;

public class ButtonController {//This class is used to control the buttons
    //Variables
    private  int gameHeight = 8; //Height of the game Should change to be configurable late
    private  int gameWidth = 8;  //Width of the game Should change to be configurable late
    private int bombsPossible = 8; //Number of bombs possible to touch any given button
    //Objects
    Button[][] msButtons = new Button[gameHeight][gameWidth];            //Two Dim Array of buttons for the game
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
    //Methods
    public void buttonClicked(int i, int j){            //This method decides what to do when a button is clicked
        msButtons[i][j].setText(printRandomBomb());
    }
    public String printRandomBomb(){                    //Method that prints out a random value of BombsPossible
        int randomNum = (int)(Math.random() * bombsPossible);   //Get a random number between 0 and bombsPossible
        return (bombsInRange[randomNum]);                       //Print out the random number
    }
    public void setBoredSize(){
        //TODO
        /** Classic Minesweeper is 8x8
         *  Easy Minesweeper is a 9x9
         *  Medium Minesweeper is a 16x16
         *  Hard Minesweeper is a 30x16
         */
    }
    public void randomizeBombs(){                       //This method randomizes the bombs on the board
        //TODO
        /** Classic Minesweeper has 8 bombs on the board
         *  Easy Minesweeper has 10 bombs on the board
         *  Medium Minesweeper has 40 bombs on the board
         *  Hard Minesweeper has 99 bombs on the board
         */
    }
    public void checkForBombs(){                       //This method checks for bombs around the button
        //TODO
    }
    public void checkForWin(){                         //This method checks for a win
        //TODO
    }
    public void checkForLoss(){                        //This method checks for a loss
        //TODO
    }

}//Closing ButtonController
