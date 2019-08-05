/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectcreate;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Objectcreate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        one object=new one();
        object.a=10;
        System.out.println(object.a);
        one object1=new one();
        object1.a=20;
        System.out.println(object1.a);
    }
    
}
class one
{
    int a;
}
