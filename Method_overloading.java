/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_overloading;

/**
 *
 * @author LAKSHMI KUMARI
 */
class area
{
    int l,b;
    float r;
    double h,w;
    private int x;
    area(int x,int y)
    {
        System.out.println("area of rectangle:");
        l=x;
        b=y;
        System.out.println(l*b);
    }
    area(float x)
    {
        System.out.println("area of circle:");
        r=x;
        System.out.println(Math.PI*r*r);
    }
    area(double x,double y)
    {
        System.out.println("area of triangle::");
        h=x;
        w=y;
        System.out.println(0.5*h*w);
    }
}
public class Method_overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        area k=new area(10,20);
        area l=new area(4);
        area n=new area(30,24);
    }
    
}
