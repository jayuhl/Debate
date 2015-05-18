package me.mark.debate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by volkovma on 5/13/15.
 */
public class Round {

    private int roundNum;
    private List<Debate> debates;
    public static List<Round> rounds = new ArrayList<Round>();//Why?
    
    public static Round getRound(int num) {
        for (Round r : rounds) {
            if (r.roundNum == num) {
                return r;
            }
        }
        return null;
    }
    
    public Round(int num) {
       this.roundNum=num;
       debates = new ArrayList<Debate>();
    }

   public int getRoundNum() {
      return roundNum;
   }

   public void setRoundNum(int roundNum) {
      this.roundNum = roundNum;
   }

   public List<Debate> getDebates() {
      return debates;
   }

   public void setDebates(List<Debate> debates) {
      this.debates = debates;
   }
   
   public void addDebate(Debate d) {
      this.debates.add(d);
   }



}
