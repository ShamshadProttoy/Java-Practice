
package hackerrranksolving;

import java.util.Scanner;

public class Namta {
      private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
         int N = scanner.nextInt();
         int result;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {
           result=N*i;
            System.out.println(N+" x "+i+" =  "+result);
        }

        scanner.close();
    }
    
}
