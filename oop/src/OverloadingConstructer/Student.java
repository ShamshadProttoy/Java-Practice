
package OverloadingConstructer;

public class Student {
    String name;
    String gender;
    int idno;
    Student()
    {
        System.out.println("no value");
    }
    
    Student(String n,String g )
    {
        name=n;
        gender=g;
    }
    Student(String n,String g,int id)
    {
        name=n;
        gender=g;
        idno=id;
    }
    void display()
    { 
        System.out.println("NAME="+name);
        System.out.println("gender="+gender);
        System.out.println("ID="+idno);
    }
    
    
}
