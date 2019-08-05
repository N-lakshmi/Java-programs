/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_buf_replace;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Str_buf_replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer k=new StringBuffer("communication is very important");
        StringBuffer l=k.replace(4,20,"hai");
        System.out.println(l);
    }
    
}
