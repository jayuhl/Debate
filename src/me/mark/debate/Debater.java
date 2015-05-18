package me.mark.debate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by volkovma on 5/13/15.
 */
public class Debater extends Student {

    private List<Integer> speakerScores;
    private double idNum;
    private int numWins;
    private int numLosses;
    
    public static List<Debater> debaters = new ArrayList<Debater>();

    public Debater(String name, String school_ID, double idNum, int numWins, int numLoses) {
        super(name, school_ID);
        this.speakerScores = new ArrayList<Integer>();
        this.idNum = idNum;
        this.numWins = numWins;
        this.numLosses = numLoses;
        debaters.add(this);
    }

    public int getLosses() {
        return numLosses;
    }

    public void setLosses(int losses) {
       this.numLosses = losses;
   }
    
    public void incrementLosses() {
        this.numLosses++;
    }

    public int getWins() {
        return numWins;
    }

    public void setWins(int numWins) {
        this.numWins = numWins;
    }
    
    public void incrementWins() {
       this.numWins++;
   }

    public double getIdNum() {
        return idNum;
    }

    public void setIdNum(double idNum) {
        this.idNum = idNum;
    }

    public List<Integer> getSpeakerScores() {
        return speakerScores;
    }

    public void setSpeakerScores(List<Integer> speakerScores) {
        this.speakerScores = speakerScores;
    }
    
    public void addSpeakerScore(Integer score) {
       this.speakerScores.add(score);
    }
}
