package me.mark.debate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by volkovma on 5/13/15.
 */
public class Judge extends Student{

    private List<Team> teamsJudged;
    private boolean isExperienced;
    private int roundsJudged = 0;
    
    public Judge(String name, String school_ID, boolean isExperienced) {
        super(name, school_ID);
        this.teamsJudged = new ArrayList<Team>();
        this.isExperienced = isExperienced;
    }

    public int getRoundsJudged() {
        return roundsJudged;
    }

    public void incrementRoundsJudged() {
        this.roundsJudged++;
    }

    public List<Team> getTeamsJudged() {
        return teamsJudged;
    }

    public void setTeamsJudged(List<Team> teamsJudged) {
        this.teamsJudged = teamsJudged;
    }
    
    public void addTeamsJudged(Team t) {
       this.teamsJudged.add(t);
    }

    public boolean isExperienced() {
        return isExperienced;
    }

    public void setExperienced(boolean isExperienced) {
        this.isExperienced = isExperienced;
    }
}
