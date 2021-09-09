
package hackerrranksolving;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;


public class Result {
    
    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
		LocalDate dt = LocalDate.of(year, month, day);
                DayOfWeek s=dt.getDayOfWeek();
                String sb=String.valueOf(s);
		System.out.println(sb);
		in.close();
    
}
}