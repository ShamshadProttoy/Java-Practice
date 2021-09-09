
package anisulislam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class valid_usernm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String in=input.nextLine();
        System.out.println(Pattern.matches("^[a-zA-Z]\\w{7,29}", in));
    }
    
}
