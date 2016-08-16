package com.duxnort.baseballscorebook.Model;

import java.util.Date;

public class Player extends Person {
    private String jerseyNumber = null;
    private OverallStats stats = null;
    private boolean batRight = false;
    private boolean batLeft = false;
    private boolean throwRight = false;
    private boolean throwLeft = false;
    private int heightInches = 0;
    private int weight = 0;
    private Date dateOfBirth = null;

    public Player() {
    }

    public Player(String firstName, String lastName, String jerseyNumber, OverallStats stats,
                  boolean batRight, boolean batLeft, boolean throwRight, boolean throwLeft,
                  int heightInches, int weight, Date dateOfBirth) {
        super(firstName, lastName);
        this.jerseyNumber = jerseyNumber;
        this.stats = stats;
        this.batRight = batRight;
        this.batLeft = batLeft;
        this.throwRight = throwRight;
        this.throwLeft = throwLeft;
        this.heightInches = heightInches;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public OverallStats getStats() {
        return stats;
    }

    public void setStats(OverallStats stats) {
        this.stats = stats;
    }

    public boolean isBatRight() {
        return batRight;
    }

    public void setBatRight(boolean batRight) {
        this.batRight = batRight;
    }

    public boolean isBatLeft() {
        return batLeft;
    }

    public void setBatLeft(boolean batLeft) {
        this.batLeft = batLeft;
    }

    public boolean isThrowRight() {
        return throwRight;
    }

    public void setThrowRight(boolean throwRight) {
        this.throwRight = throwRight;
    }

    public boolean isThrowLeft() {
        return throwLeft;
    }

    public void setThrowLeft(boolean throwLeft) {
        this.throwLeft = throwLeft;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isSwitchHitter() {
        if(isBatRight() && isBatLeft()){
            return true;
        }
        return false;
    }
}
