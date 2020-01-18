package five;

import java.util.Calendar;
import java.util.TimeZone;

public class WhatIsFactory {
    /**
     * It is under creational category.
     * It is called Template method also
     *
     * When to use it ?
     *  - When we need to create similar objects that shares common interface
     *
     *  - A class will not know what classes it will be required to create
     *  - We create object without exposing the creation logic to the client
     *
     *  Discussions :
     *
     *  - We can create an instance of any one of several possible classes
     *  that have a common parent class.
     *
     *  - The common parent class can be an abstract class, or an interface
     *
     *  Examples from java library :
     *  java.util.Calendar#getInstance()
     *  java.lang.Class#newInstance()
     *  java.text.NumberFormat#getInstance()
     *  java.nio.charset.Charset#forName()
     *  java.lang.Class#forName()
     *
     */

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        System.out.println("gmt:" + gmtCal.getTime());

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Calendar utcCal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        System.out.println("utc:" + utcCal.getTime());

        TimeZone.setDefault(TimeZone.getTimeZone("EST"));
        Calendar estCal = Calendar.getInstance(TimeZone.getTimeZone("EST"));
        System.out.println("est:" + estCal.getTime());
    }
}
