/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_token_count;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Str_token_count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringTokenizer d=new StringTokenizer("hello welcome to my world");
        int f=d.countTokens();
        System.out.println(f);
    }
    
}
