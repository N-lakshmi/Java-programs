/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunamic_ini_class;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Dunamic_ini_class {

    /**
     * @param args the command line arguments
     */
    int a;
    Dunamic_ini_class()
    {
        a=10;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Dunamic_ini_class ob=new Dunamic_ini_class();
        System.out.println(ob.a); //dynamic initialization in class
    }
    
}
