package me.mark.debate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by volkovma on 5/13/15.
 */
public class Tournament {

    private List<Round> rounds;
    
    public Tournament() {
       rounds = new ArrayList<Round>();
    }

   public List<Round> getRounds() {
      return rounds;
   }

   public void setRounds(List<Round> rounds) {
      this.rounds = rounds;
   }
   
   public void addRound(Round r) {
      this.rounds.add(r);
   }
    
}
