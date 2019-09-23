package com.lambdaschool.solution;

public class TrackAthleteImpl implements Athlete {
    @Override
    public void display(String sport, String Athlete) {
        System.out.println(sport + " " + Athlete);
    }

    @Override
    public String read() {
        return "Not implemented";
    }
}
