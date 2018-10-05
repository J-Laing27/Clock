//  Jordan Laing - 15009237
//  04/10/2018
//  Clock
//  Clock.java - Contains main method used to initiate clock

public class Clock {
    public static void main(String args[])
    {
        GetTime newClock = new GetTime();
        newClock.showDate();
        newClock.printTime();
    }
}