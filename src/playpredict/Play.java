/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpredict;

/**
 *
 * @author Michael
 */
public class Play {


        private int quarter;   
        private int timeLeft;        
        private int down;
        private int togo;
        private int netScore;
        private boolean rush;
        private boolean pass;
        
        public Play (int quarter,int timeLeft,int down,int togo, int netScore,int rush,int pass){
            this.down = down;
            this.togo = togo;
            this.timeLeft = timeLeft;
            this.quarter = quarter;
            this.netScore = netScore;
            this.rush = (rush == 1);
            this.pass = (pass == 1);            
        }        

    public int getQuarter() {
        return quarter;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public int getDown() {
        return down;
    }

    public int getTogo() {
        return togo;
    }

    public int getNetScore() {
        return netScore;
    }

    public boolean isRush() {
        return rush;
    }

    public boolean isPass() {
        return pass;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public void setTogo(int togo) {
        this.togo = togo;
    }

    public void setNetScore(int netScore) {
        this.netScore = netScore;
    }

    public void setRush(int rush) {
        this.rush = (rush == 1);              
    }

    public void setPass(int pass) {
        this.pass = (pass == 1); 
    }
                
}


