/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpredict;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Michael
 */
public class PlayPredict {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    
    
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
        
        System.out.println("Welcome to Play Predictor!");
        
        
        Scanner user;
        String userInput;
        user = new Scanner(System.in);
        
        boolean run = true;
        while(run){
        
            System.out.println("Would you like to add a new game(ADDGAME), PREDICT a game, or QUIT?");
            userInput = user.next();

            if(userInput.equals("ADDGAME")){
                System.out.println("Please enter the name of a text file to be added:");
                userInput = user.next();        //get workout text file name from user to be read.
                //Adds all of the info from a text file to the game class newGame
                Game newGame = addGame(userInput);
                //Write this info the a text file named after the offense
                String title = newGame.getOffense() + ".txt";
                ArrayList<Integer> data = new ArrayList<>();
                if(new File(title).isFile()){
                    //READ prevous values
                }
                //clear/create file
                PrintWriter teamFile = new PrintWriter(title, "UTF-8");
                //Get info from game and add it to the data and write data to teamFile
                teamFile.close();
                
                
                
            }else if(userInput.equals("PREDICT")){
                /*
                System.out.println("Here is the list of current games available:");
                
                for(int i=0;i<allGames.size();i++){
                    System.out.println(i + allGames.get(i).getOffense() + " vs " + allGames.get(i).getDefense());
                }
                
                System.out.println("Pick the game(s) you would like to analyze with");
                //User picks a number 
                userInput = user.next();        
                //That number's game is user to find pGame
                Game pGame = allGames.get(Integer.parseInt(userInput)); 
                //have user enter current senario
                System.out.println("Enter quarter,down,yards to go,time left,netscore");
                userInput = user.next();
                String[] situation = userInput.split(",");
                //use those values and pGame to calculate the chance or run or pass
                //print that value
                */
            }else if(userInput.equals("QUIT")){
                run = false;
            }
         
        }    
           
        System.exit(0);        
    }

    private static Game addGame(String fileName) throws FileNotFoundException {
        
        Scanner user;
        user = new Scanner(System.in);

      
        System.out.println("Offense:");
        String offense = user.next();
        System.out.println("Defense:");
        String defense = user.next();
        System.out.println("Week:");
        int week  = Integer.parseInt(user.next());       
        
        //Add all the plays from the file as a new game and return it
        Game game = new Game(offense,defense,week);     
        game.addPlays(fileName);
        
        return game;
        
    }
    
    
            
}
