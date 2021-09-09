
package anisulislam;

import java.util.Scanner;


public class SubStringprac {
    public static void main(String[] args) {
        
              String[] words = { "Peach", "Orange", "Mango", "Cherry","Apple"};
              
             // int n=5;
    
       int n = 5;
      System.out.println("The original order of the words is: ");
      for(int i = 0; i < n; i++) {
         System.out.println(words[i]);
      }
      for(int i = 0; i < 1; ++i) {
         for (int j = i + 1; j < n; ++j) {
            if (words[i].compareTo(words[j]) > 0) {
               String temp = words[i];
               words[i] = words[j];
               words[j] = temp;
            }
         }
      }
      System.out.println("\nThe lexicographical order of the words is: ");
      for(int i = 0; i < n; i++) {
         System.out.println(words[i]);
      }
        
        
        
        
        
        
       /* Scanner input=new Scanner(System.in);
        String str=input.next();
        String str1=input.next();
        
        System.out.println("compare"+str.compareTo(str1));*/
        
       /* int k=input.nextInt();
       String cur=str.substring(i, i+k);
            if(high.compareTo(cur)>0)
            {
                high=cur;
                
            } String high=str.substring(0,k);
        for(int i=0;i<=str.length()-k;i++)
        {
            
        }
        System.out.println(high);*/
    }
            
}
