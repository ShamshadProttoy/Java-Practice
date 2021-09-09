
package oop;


public class Student {
    String name,gender;
    int number;
    Student()
    {
        System.out.println("no value");

    }
    
        
        
        Student(String str,String gen,int num)
    {
        name=str;
        gender=gen;
        number=num;
    }
    void display()
    {
        System.out.println("NAME="  +name);
        System.out.println("GENDER=" +gender);       
        System.out.println("NUMBER=" +number);
    }
    
}
