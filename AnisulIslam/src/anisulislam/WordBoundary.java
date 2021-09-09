
package anisulislam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WordBoundary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println(Pattern.matches("(\\w+)",s));
    }
    
}
