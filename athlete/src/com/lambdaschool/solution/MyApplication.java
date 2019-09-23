package com.lambdaschool.solution;

//public class MyApplication
//{
//    private Athlete athlete = new Athlete();
//
//    public void create(String sport)
//    {
//        System.out.println("************");
//        athlete.display(sport);
//        System.out.println("************\n");
//    }
//}

public class MyApplication implements Processor
{
    private Athlete ath;
    public MyApplication(Athlete ath)
    {
        this.ath = ath;
    }
    public void displayAthlete(String sport, String athlete)
    {
        sport =  " ********** \n" + sport ;
        athlete = athlete + "\n **********";
        ath.display(sport, athlete);
    }
    @Override
    public String read()
    {
        return "Not Implemented";
    }
}
