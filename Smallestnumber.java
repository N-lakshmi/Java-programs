/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestnumber;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Smallestnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=12,b=10,c=30;
        if(a<b&&a<c)
        {
            System.out.println(a);
        }
        if(b<a&&b<c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
        
    }
    
}
