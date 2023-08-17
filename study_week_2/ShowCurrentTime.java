package week_02.study;

        /*
        The System class has a method called currentTimeMillis that gives you
        the current time in milliseconds since a speciÞc starting point in history.
        This starting point is like the beginning of time for computers,
        and it's called the UNIX epoch.
        This epoch began at midnight on January 1,1970,
        when the UNIX operating system came into play.
        */

public class ShowCurrentTime {
    public static void main (String [] args) {

        // Obtain the milliseconds since midnight, Jan 1, 1970
        long totalMilliSeconds = System.currentTimeMillis();

        //Obtain the total seconds since midnight, Jan 1, 1970
        //Obtain the total seconds totalSeconds by dividing totalMilliseconds by 1000
        long totalSeconds = totalMilliSeconds / 1000;

        // Compute the current second in the minute for hour
        long currentSecond = totalSeconds % 60 ;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60 ;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60 ;

        // Compute the current hour
        long currentHour = (totalHours+2) % 24 ;

        //Display results
        System.out.println("Current time is " + currentHour + " : " + currentMinute +
                " : " + currentSecond + " GMT ");
    }
}
