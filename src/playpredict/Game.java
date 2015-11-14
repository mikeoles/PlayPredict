/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpredict;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Game {
    private ArrayList<Play> playList = new ArrayList<>();
    private String offense;
    private String defense;
    private int week;
    
    public Game(String offense, String defense, int week){
        this.offense = offense;
        this.defense = defense;
        this.week = week;
    }

    public ArrayList<Play> getPlayList() {
        return playList;
    }

    public void setPlayList(ArrayList<Play> playList) {
        this.playList = playList;
    }

    public String getOffense() {
        return offense;
    }

    public void setOffense(String offense) {
        this.offense = offense;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
    
    public void addPlays(String playFileName) throws FileNotFoundException{
        //playFile is the text file with the play data
        File playFile;
        playFile = new File(playFileName); 
        Scanner playData = new Scanner(playFile);
        //go through the file and add each play to this game
        while(playData.hasNextLine()){
            String line = playData.nextLine();
            String[] data = line.split("\t");
            int quarter = Integer.parseInt(data[0]);
            int timeLeft = Integer.parseInt(data[1]);
            int down = Integer.parseInt(data[2]);
            int togo = Integer.parseInt(data[3]);
            int netScore = Integer.parseInt(data[4]);
            int rush = Integer.parseInt(data[5]);
            int pass = Integer.parseInt(data[6]);
            Play play = new Play(quarter,timeLeft,down,togo,netScore,rush,pass);
            playList.add(play);
        }
    }
}

