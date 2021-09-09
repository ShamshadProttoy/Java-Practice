/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecreating;

import java.io.File;

public class Filecreate {
    public static void main(String[] args) {
        File file1=new File("customerinfo.txt");
        File file2=new File("iteminfo.txt");
        
        try{
            
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files are created");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
        
    
}
