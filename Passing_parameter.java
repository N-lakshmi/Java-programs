/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passing_parameter;

/**
 *
 * @author LAKSHMI KUMARI
 */
class test
{
    int a,b;
    test()
    {
        System.out.println("no parameters:");
        a=10;
        b=20;
        System.out.println(a+" "+b);
    }
    test(int x)
    {
        System.out.println("one parameter");
        a=x;
        b=x;
        System.out.println(a+" "+b);
    }
    test (int x,int y)
    {
        System.out.println("two parameters");
        a=x;
        b=y;
        System.out.println(a+" "+b);
    }
}
public class Passing_parameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob=new test();
        test ob1=new test(100);
        test ob2=new test(1,3);
    }
    
}
