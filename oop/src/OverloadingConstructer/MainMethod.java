
package OverloadingConstructer;

public class MainMethod {
    public static void main(String[] args) {
        Student student1=new Student();
                student1.display();
                Student student2=new Student("prottoy","male");
                student2.display();
                Student student3=new Student("prottoy","male",12126);
                student3.display();
    }
    
}
