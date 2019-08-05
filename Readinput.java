/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readinput;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Readinput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        double b;
        float c;
        System.out.println("enter integer");
        Scanner ob=new Scanner(System.in);
        a=ob.nextInt();
        System.out.println("The number you entered is="+a);
        System.out.println("enter double");
        Scanner ob1=new Scanner(System.in);
        b=ob1.nextDouble();
        System.out.println("The number you entered is="+b);
        System.out.println("enter float");
        Scanner ob2=new Scanner(System.in);
        c=ob2.nextFloat();
        System.out.println("The number you entered is="+c);
    }
    
}
