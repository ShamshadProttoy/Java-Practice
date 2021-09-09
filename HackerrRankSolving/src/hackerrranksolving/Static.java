
package hackerrranksolving;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Static {
  static boolean flag;
    static int B;
    static int H;
     static{
        Scanner input=new Scanner(System.in);
        B=input.nextInt();
        H=input.nextInt();
     
        if(B<=0||H<=0)
        {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception ex) {
                System.out.println(ex);
            }
            flag=false;
        }
        else{
            flag=true;
        }
    }
            
            
    public static void main(String[] args) {
        if(flag)
        {int area=B*H;
            System.out.println(area);
        } }}
