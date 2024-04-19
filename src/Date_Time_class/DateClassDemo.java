package Date_Time_class;

import java.util.Date;

/*
Date is retrieved from java.time class which is inbuilt.

Date is stored in long data type in java , the java holds every millisecond's since ( 1jan 1970 ) .

java assumes that the start year for it is 1900, so it can calculate passed year since 1900 .

*/
public class DateClassDemo {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()); // this method will return number of seconds passed since 1 jan 1970.

        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // this will return no.of years passed since 1 jan 1970
        // 1000 millisecond = 1 sec .
        // 3600 seconds = 1 hour .
        // 24 hours = 1day .
        // 365 days = 1 year .


        Date d = new Date();
        System.out.println(d);
    }

}
