/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime1to100;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Prime1to100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,count;
        for(i=1;i<=100;i++)
        {
            count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
                
            }
             if(count==2)
                {
                    System.out.println(i);
                }
            
        }
        
    }
    
}
