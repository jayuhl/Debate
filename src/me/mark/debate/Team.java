package me.mark.debate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by volkovma on 5/13/15.
 */
public class Team {
	private Debater d1, d2;
	private String teamID;
	private List<Integer> scores;
	private List<Team> played;
	private boolean[] isAffirmitive;

	public static List<Team> globalTeams = new ArrayList<Team>();

	private String getTeamId() {
		int counter = 0;
		for (Team t : globalTeams) {
			if (t.d1.getSchool_ID().equals(this.d1.getSchool_ID())) {
				counter++;
			}
		}
		return d1.getSchool_ID() + (counter + 1);
	}

	public Team(Debater d1, Debater d2, boolean affirmitive) {
		this.d1 = d1;
		this.d2 = d2;
		this.teamID = (this.getTeamId() != null ? this.getTeamId() : this.d1
				.getSchool_ID() + 1);
		this.scores = new ArrayList<Integer>();
		this.played = new ArrayList<Team>();
		globalTeams.add(this);
		this.isAffirmitive = new boolean[4];
	}

	public Team getTeam(String teamID) {
		for (Team t : globalTeams) {
			if (t.getID().equals(teamID))
				return t;
		}
		return null;
	}

	public Debater getD1() {
		return d1;
	}

	public void setD1(Debater d1) {
		this.d1 = d1;
	}

	public Debater getD2() {
		return d2;
	}

	public void setD2(Debater d2) {
		this.d2 = d2;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}

	public void addScores(Integer score) {
		this.scores.add(score);
	}

	public List<Team> getPlayed() {
		return played;
	}

	public void setPlayed(List<Team> played) {
		this.played = played;
	}

	public void addPlayed(Team t) {
		this.played.add(t);
	}

	public static List<Team> getGlobalTeams() {
		return globalTeams;
	}

	public String getID() {
		return teamID;
	}

	public boolean[] getIsAffirmitive() {
		return isAffirmitive;
	}

	public void setIsAffirmitive(boolean isAff, int round) {// Round is 1, 2, 3,
															// or 4, not zero
		this.isAffirmitive[round - 1] = isAff;
	}
}
