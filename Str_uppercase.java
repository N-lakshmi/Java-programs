/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_uppercase;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.lang.String;
import java.util.*;
public class Str_uppercase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("enter the string:");
        Scanner ob=new Scanner(System.in);
        String s1=ob.nextLine();
        System.out.println("string you entered is :"+s1);
        String l=s1.toUpperCase();
        System.out.println("upper case:"+l);
    }
    
}
