/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls_all_operations;

/**
 *
 * @author LAKSHMI KUMARI
 */
class kumari
{
    int n;
    kumari()
    {
        n=10;
        System.out.println(n);
    }
    int display()
    { 
        n=50;
        return n;
    }
    void print(int x)
    {
        n=x;
        System.out.println(n);
    }
    int show(int x)
    {
        n=x;
        return n;
    }
}
public class Cls_all_operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         kumari k=new kumari(); //no parameters and no return
        int c=k.display();  //with return value
        System.out.println(c);
        k.print(20);     //with parameter
        int d=k.show(30);   //with parameter and with return
        System.out.println(d);
    }
    
}
