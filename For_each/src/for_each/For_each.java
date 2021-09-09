
package for_each;

import java.util.Scanner;

public class For_each {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Animals you want to entry");
        int n =input.nextInt();
        Animal animal[]=new Animal[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of the animal");
            
            String s=input.next();
            
            System.out.println("animal age");
            int t=input.nextInt();
            animal[i]=new Animal(s,t);
        }
        for(Animal anim:animal)
        {
            System.out.println("Name:"+anim.name);
            System.out.println("Age:"+anim.age);
        }
  
    }
    
}
