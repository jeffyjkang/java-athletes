package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        String athlete1 = "Runner";
        String athlete2 = "Goalie";
        String athlete3 = "Athlete";

        String sport1 = "Track";
        String sport2 = "Hockey";
        String sport3 = "Rugby";
        String sport4 = "Baseball";

        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(sport1, athlete1);

//        // Create a Hockey Athlete
//        injector = new HockeyAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete(sport2, athlete2);
//
//
//        // Create a Rugby Athlete
//        injector = new RugbyAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete(sport3, athlete3);
//
//        // Create a Baseball Athlete
//        injector = new BaseballAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete(sport4, athlete3);

    }
}
