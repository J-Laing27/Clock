import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//public class Main {
//
//    public static void main(String args[])
//    {
//        // Instantiate a Date object
//        Date date = new Date();
//        // display time and date using toString()
//        System.out.println(date.toString());
//
//        Date dNow = new Date( );
//        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//
//        System.out.println("Current Date: " + ft.format(dNow));
//        String months[] = {
//                "Jan", "Feb", "Mar", "Apr",
//                "May", "Jun", "Jul", "Aug",
//                "Sep", "Oct", "Nov", "Dec"};
//        int year;
//        // Create a Gregorian calendar initialized
//        // with the current date and time in the
//        // default locale and timezone.
//        GregorianCalendar gcalendar = new GregorianCalendar();
//        // Display current time and date information.
//        System.out.print("Date: ");
//        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
//        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
//        System.out.println(year = gcalendar.get(Calendar.YEAR));
//        System.out.print("Time: ");
//        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
//        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
//        System.out.println(gcalendar.get(Calendar.SECOND));
//        // Test if the current year is a leap year
//        if(gcalendar.isLeapYear(year)) {
//            System.out.println("The current year is a leap year");
//        }
//        else {
//            System.out.println("The current year is not a leap year");
//        }
//    }
//}