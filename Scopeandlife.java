/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scopeandlife;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Scopeandlife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10;
        {
            int b=20;
            System.out.println(a);
        }
        System.out.println(b);
    }
    
}
