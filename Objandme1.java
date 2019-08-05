/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objandme1;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Objandme1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rectangle object=new rectangle();
        object.display();
    }
    
}
class rectangle
{
    int a;
    void display()
    {
        a=20;
        System.out.println(a);
    }
}
