/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_length;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
import java.lang.String;
public class Str_length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ob=new Scanner(System.in);
        System.out.print("enter the String:::");
        String s1=ob.nextLine();
        int n=s1.length();
        System.out.println("length of the string::"+n);
    }
    
}
