/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentobj;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Studentobj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1=new student();
        s1.rno=123;
        s1.phno=9111;
        s1.display();
    }
    
}
class student
{
    int rno,phno;
    void display()
    {
        System.out.println(rno);
        System.out.println(phno);
    }
}
