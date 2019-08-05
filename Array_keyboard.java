/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_keyboard;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Array_keyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("enter the size of the array::");
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println("size of the array is :"+n);
        int a[]=new int[n];
        int i;
        System.out.println("enter the elements in the array::");
        for(i=0;i<n;i++)
        {
            Scanner ob1=new Scanner(System.in);
            int s=ob1.nextInt();
            a[i]=s;
            
        }
        System.out.println("elements in the array are::");
        for(i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }
        int j,temp=0;
       for(i=n;i>0;i--)
	{
	  for(j=0;j<i-1;j++)
	    {
		if(a[j]>a[j+1])
		    {
			temp=a[j];
		        a[j]=a[j+1];
			a[j+1]=temp;
		    }
            }
        }
        for(i=0;i<n;i++)
        {
        System.out.println("sorted elements:"+a[i]);
        }
    }
    
}
