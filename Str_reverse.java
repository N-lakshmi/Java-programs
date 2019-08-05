/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_reverse;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Str_reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char a[]=new char{100];
        char temp;
        Scanner ob=new Scanner(System.in);
        System.out.println("String length::");
        int n=ob.nextInt();
        int i;
        System.out.println("enter the string::");
        for(i=0;i<n;i++)
        {
            char c=ob.next().charAt(0);
            a[i]=c;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+"\t");
        }
        System.out.println();
        System.out.println("reverse of the string is:");
        for(i=0;i<n/2;i++)
        {
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+"\t");
        }
    }
    }
    
}
