/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;

import java.io.IOException;

/**
 *
 * @author DOLPHIN
 */
public class MainClass {
    public static void main(String[] args) {
        try{
          Demo02 m=new Demo02();  
     m.method();
        }catch(IOException e)
        {
            System.out.println(e);
        }
  
    System.out.println("normal flow...");  
    }
    
}
