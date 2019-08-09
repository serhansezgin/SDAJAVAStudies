package lesson5;

//date and time
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
public class DateAndTime {
    public static void main(String[] args) {
        //full time
        Date date = new Date();
        System.out.println(date);
        //calendar is splittable
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.MONTH));
        SimpleDateFormat asd = new SimpleDateFormat("MMM");
        System.out.println("Month in letter " + asd.format(date));
        SimpleDateFormat asd2 = new SimpleDateFormat("MM");
        System.out.println("Month in number " + asd2.format(date));
        SimpleDateFormat asd3 = new SimpleDateFormat("dd MM YYYY");
        System.out.println("According your requirements " + asd3.format(date));
    }
}






