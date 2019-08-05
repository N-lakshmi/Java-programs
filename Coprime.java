/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coprime;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Coprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4,b=2,r;
        r=a%b;
        while(r!=0)
        {
            a=b;
            b=r;
            r=a%b;
         }
        if(b==1)
            System.out.println("given numbers are coprimes");
        else
            System.out.println("not coprimes");
    }
    
}
