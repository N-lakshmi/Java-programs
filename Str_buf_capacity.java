/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_buf_capacity;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Str_buf_capacity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer y=new StringBuffer();
        int z=y.capacity();
        System.out.println(z);
        StringBuffer x=new StringBuffer(100);
        int a=x.capacity();
        System.out.println(a);
    }
    
}
