/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_concat;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
import java.lang.String;
public class Str_concat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ob=new Scanner(System.in);
        System.out.print("enter the 1st string::");
        String s1=ob.nextLine();
        System.out.println("1st sting is "+s1);
        Scanner ob1=new Scanner(System.in);
        System.out.println("enter the 2nd string::");
        String s2=ob1.nextLine();
        System.out.println("2nd string is "+s2);
        String s3;
        s3=s1+s2;
        System.out.println(s3);
        
    }
    
}
