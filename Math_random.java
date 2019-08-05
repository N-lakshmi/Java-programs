/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math_random;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Math_random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Math.random());
        Random h=new Random();
        System.out.println(h.nextInt(10));
        System.out.println(h.nextDouble());
        System.out.println(h.nextLong());
        System.out.println(h.nextFloat());
    }
    
}
