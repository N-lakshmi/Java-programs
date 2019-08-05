/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author LAKSHMI KUMARI
 */
class test
{
    static int a;
    static void print()
    {
        a=50;
        System.out.println(a);
    }
}
public class Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        test ob=new test();
        a=20;
        System.out.println(a);
        print();
    }
    
}
