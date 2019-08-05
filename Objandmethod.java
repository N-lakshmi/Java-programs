/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objandmethod;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Objandmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        med object=new med();
        /*object.a=30;
        System.out.println(object.a);
        object.kumari();
        System.out.println(object.a);*/
        object.kumari();
        object.a=30;
        System.out.println(object.a);
        object.kumari();
        
    }
    
}
class med
{
    int a;
    void kumari()
    {
        a=10;
        //System.out.println(a);
    }
}
