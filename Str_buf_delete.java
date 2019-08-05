/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_buf_delete;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Str_buf_delete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer i=new StringBuffer("lakshmi kumari");
        StringBuffer n=i.delete(2, 9);
        System.out.println(n);
                
    }
    
}
