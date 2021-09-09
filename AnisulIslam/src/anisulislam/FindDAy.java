/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislam;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;


public class FindDAy {
    
    public static String FindDay(int month,int day,int year )
    {
        int d=Integer.valueOf(day);
        int m=Integer.valueOf(month);
        int y=Integer.valueOf(year);
        LocalDate dt=LocalDate.of(y,m,d);
        DayOfWeek s=dt.getDayOfWeek();
        String sb=String.valueOf(s);
        return sb;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mon=input.nextInt();
        int dayy=input.nextInt();
        int yr=input.nextInt();
        String ss=FindDay(mon,dayy,yr);
        System.out.println(ss);
    }
    
}

