package com.lambdaschool.solution;

public class AthleteCreationImpl implements Athlete {
    @Override
    public void display(String sport, String athlete) {
        System.out.println(sport + " " + athlete);
    }

    @Override
    public String read() {
        return "Not implemented";
    }
}