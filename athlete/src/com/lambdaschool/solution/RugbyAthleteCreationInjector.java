package com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteInjector {
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new TrackAthleteCreationImpl());
    }
}
