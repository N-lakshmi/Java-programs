/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_from_str;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.lang.String;
public class String_from_str {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char str[]={'h','e','l','l','o'};
        String s1= new String(str);
        String s2=new String(str,1,3);
        System.out.println(s2);
    }
    
}
