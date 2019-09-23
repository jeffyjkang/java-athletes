package com.lambdaschool.solution;

public class AthleteCreationInjector implements AthleteInjector {
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new AthleteCreationImpl());
    }
}
