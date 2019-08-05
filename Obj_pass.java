/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj_pass;

/**
 *
 * @author LAKSHMI KUMARI
 */
class kumari
{
    int a;
    kumari()
    {
        System.out.println("k");
    }
    void display(kumari x)
    {
      x.a=40;
    }
}
public class Obj_pass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kumari ob=new kumari();
        ob.display(ob);
        System.out.println(ob.a);
    }
    
}
