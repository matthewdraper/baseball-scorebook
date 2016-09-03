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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (roster != null ? !roster.equals(team.roster) : team.roster != null) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;
        if (city != null ? !city.equals(team.city) : team.city != null) return false;
        return state == team.state;

    }

    @Override
    public int hashCode() {
        int result = roster != null ? roster.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
