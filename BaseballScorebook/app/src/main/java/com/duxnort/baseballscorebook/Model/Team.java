package com.duxnort.baseballscorebook.Model;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> roster = null;
    private String name = null;
    private String city = null;
    private State state = null;

    public Team() {
    }

    public Team(ArrayList<Player> roster, String name, String city, State state) {
        this.roster = roster;
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public ArrayList<Player> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Player> roster) {
        this.roster = roster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
