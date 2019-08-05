/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_nexttoken;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Str_nexttoken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringTokenizer g=new StringTokenizer("hello welcome to my world");
        String h=g.nextToken();
        System.out.println(h);
        String i=g.nextToken();
        System.out.println(i);
        String j=g.nextToken();
        System.out.println(j);
        String k=g.nextToken();
        System.out.println(k);
        String l=g.nextToken();
        System.out.println(l);
    }
    
}
