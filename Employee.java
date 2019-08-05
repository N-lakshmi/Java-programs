/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author LAKSHMI KUMARI
 */
import java.util.*;
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       details e1=new details();
       e1.input();
       e1.output();
        
        
        
    }
}
    class details
    {
            String name;
            int id;
            double salary;
            String add;
            void output()
            {
                System.out.println(name);
                System.out.println(id);
                System.out.println(salary);
                System.out.println(add);
            }
            void input()
                    
            {
               
                Scanner ob=new Scanner(System.in);
                System.out.println("enter the name of the employee::");
                name=ob.nextLine();
                System.out.println("enter the id::");
                id=ob.nextInt();
                System.out.println("enter the salary::");
                salary=ob.nextInt();
               
                
            }
            
        
}

