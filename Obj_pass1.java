/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj_pass1;

/**
 *
 * @author LAKSHMI KUMARI
 */
class test
{
    int a;
    test()
    {
        a=10;
        System.out.println(a);
    }
    void display(test ob)
    {
        System.out.println("inside::"+ob.a);
        a=ob.a;
        System.out.println("valu::::"+a);
    }
}
public class Obj_pass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob=new test();
        test ob2=new test();
        ob2.display(ob);
        ob.a=80;
        ob2.display(ob);
    }
    
}
