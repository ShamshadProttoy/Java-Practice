
package anisulislam;


public class StringPractice {
    public static void main(String[] args) {
        String s=new String("prottoy").intern();
        String ss=new String("prottoy");
       String s1="prottoy";
        System.out.println(s==ss);
        System.out.println(s==s1);
    }
    
}
