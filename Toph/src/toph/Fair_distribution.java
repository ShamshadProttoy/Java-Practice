
package toph;

import java.util.Scanner;


public class Fair_distribution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int res=y/x;
        res++;
        int t=x*res;
        System.out.println(t-y);
    }
    
}
