
package anisulislam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Time {
    public static void main(String[] args) {
        Date dt=Calendar.getInstance().getTime();
        DateFormat f ; //=DateFormat.getTimeInstance(DateFormat.DEFAULT,Locale.UK);
        f= new SimpleDateFormat("dd/mm/yyyy");
        String fff=f.format(dt);
        System.out.println(fff);
    }
    
}
