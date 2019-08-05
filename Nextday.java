/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextday;

/**
 *
 * @author LAKSHMI KUMARI
 */
public class Nextday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int day=16,mon=7,year=2019;
        if(mon==1||3||5||7||8||10&&day==31)
        {
            day=1;
            mon++;
        }
        if(mon==4||6||9||11&&day==30)
        {
            day=1;
            mon++;
        }
        if(mon==12&&day==31)
        {
            day=1;
            mon=1;
            year++;
        }
        if(year%4==0&&year%400==0&&day==28)
        {
            day++;
        }
        else
        {
            day=1;
            mon++;
        }
        day++;
     }
}
    

