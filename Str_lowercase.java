/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_lowercase;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
import java.lang.String;
public class Str_lowercase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("enter the string::");
        Scanner k=new Scanner(System.in);
        String l=k.nextLine();
        System.out.println("the string you entered is:"+l);
        String n=l.toLowerCase();
        System.out.println("the lower case is:"+n);
    }
    
}
