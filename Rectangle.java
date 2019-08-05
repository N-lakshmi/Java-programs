/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        len object=new len();
        object.a=10;
        object.b=20;
        object.area();
        object.parameter();
        
    }
    
}
class len
{
    int a,b;
    void area()
    {
        int c;
        c=a*b;
        System.out.println(c);
    }
    void parameter()
    {
        int d;
        d=a+b;
        d*=2;
        System.out.println(d);
    }
   
}