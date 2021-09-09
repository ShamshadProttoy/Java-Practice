
package Number;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        String str="";
        int total=0;
        int product=1;
        int count=0;
        Scanner input=new Scanner(System.in);
        while (!str.equals("q"))
        {System.out.println("enter a number or q to quit");
        str=input.next();
        
        if(!str.equals("q"))
        {
            int num=Integer.parseInt(str);
            total=total+num;
            product=product*num;
            count++;
        }
        }
        float avg=total/count;
        System.out.println("product="+product);
        System.out.println("avg="+avg);
    }
    
}
