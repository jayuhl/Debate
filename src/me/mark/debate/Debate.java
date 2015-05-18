package me.mark.debate;


/**
 * Created by volkovma on 5/13/15.
 */
public class Debate {

    private Team t1, t2;
    private Judge j;
    private Timer t;
    private Room r;

    public Debate(Team t1, Team t2, Judge j, Timer t, Room r) {
        this.t1 = t1;
        this.t2 = t2;
        this.j = j;
        this.t = t;
        this.r = r;
    }

    public Team getTeam1() {
        return t1;
    }

    public void setTeam1(Team t1) {
        this.t1 = t1;
    }

    public Team getTeam2() {
        return t2;
    }

    public void setTeam2(Team t2) {
        this.t2 = t2;
    }

    public Judge getJudge() {
        return j;
    }

    public void setJudge(Judge j) {
        this.j = j;
    }

    public Timer getTimer() {
        return t;
    }

    public void setTimer(Timer t) {
        this.t = t;
    }

    public Room getRoom() {
        return r;
    }

    public void setRoom(Room r) {
        this.r = r;
    }
}
