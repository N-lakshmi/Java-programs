/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package another_cls;

/**
 *
 * @author LAKSHMI KUMARI
 */
class test
{
    test()
    {
        System.out.println("constructor");
    }
    void display()
    {
        System.out.println("hello");
    }
    void print()
    {
        
        System.out.println("hai");
        display();
    }
}
public class Another_cls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob=new test();
        ob.print();
        test ob1=new test();
            
    }
    
}
