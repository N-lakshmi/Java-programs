/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumcheck;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Primenumcheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=2,i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("not prime");
        }
        
    }
    
}
