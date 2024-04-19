package Date_Time_class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeClass_demo {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t =LocalTime.now();
        System.out.println(t);

        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);

        // Specific date formatter Below  .
        LocalDateTime  Dt = LocalDateTime.now();
        System.out.println(Dt);

        DateTimeFormatter df =DateTimeFormatter.ofPattern("dd-mm-yyyy");  // this is the format
        String mydate =Dt.format(df);  //  creating date string using date and format
        System.out.println(mydate);



    }
}
