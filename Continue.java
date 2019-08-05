/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcontinue;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        do
        {
            System.out.println(i);
            i++;
            if(i==5)
                continue;
        }
        while(i<10)
    }
    
}
