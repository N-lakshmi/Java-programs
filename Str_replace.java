/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_replace;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
import java.lang.String;
public class Str_replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String k="helloll";
        String n=k.replace('l','a');
        System.out.println(n);
        String l=k.replace("lo","12");
        System.out.println(l);
        String m=k.replaceFirst("ll","ab");
        System.out.println(m);
        String o=k.replaceAll("ll","23");
        System.out.println(o);
        
                
        
        
        
    }
    
}
