//  Jordan Laing - 15009237
//  04/10/2018
//  Clock
//  GetTime.java - Detects time and displays in console

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {

    Date currentTime = new Date();  //Detects the current date & time
    SimpleDateFormat curDate = new SimpleDateFormat("E yyyy.MM.dd"); //sets format for printing date information
    SimpleDateFormat curTime = new SimpleDateFormat("HH:mm:ss"); //sets format for printing date information

    public void showDate() {

        //print date information to console
        System.out.println("Current Date: " + curDate.format(currentTime));
    }

    public void printTime() {

        //print time information to console
        for (int counter = 1; counter < 10; counter++) {
            System.out.println("Current Time: " + curTime.format(currentTime));
        }
    }

    public void clockInterrupt(){

        //interrupts counting when user presses a key
    }
}
