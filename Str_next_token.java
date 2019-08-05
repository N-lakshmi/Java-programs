/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_next_token;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Str_next_token {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringTokenizer d=new StringTokenizer("hello,my,world",",");
        String f=d.nextToken(",");
        System.out.println(f);
        String g=d.nextToken(",");
        System.out.println(g);
        String e=d.nextToken(" ");
        System.out.println(e);
        
    }
    
}
