/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_recur;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Factorial_recur {

    /**
     * @param args the command line arguments
     */
    static int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int i,fact=1;
        int number=4;
        fact=factorial(number);
        System.out.println("factorial of 4 is::"+fact);
        
    }
    
}
