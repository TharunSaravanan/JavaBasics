/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package months;

/**
 *
 * @author tharun
 */
public class Months {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String[] months = new String[12];
     months[0] = "January";
     months[1] = "February";
     months[2] = "March";
     months[3] = "April";
     months[4] = "May";
     months[5] = "June";
     months[6] = "July";
     months[7] = "August";
     months[8] = "September";
     months[9] = "October";
     months[10] = "November";
     months[11] = "December";
       
     for(int i=0; i < 12; i++)
        System.out.println(months[i]);
        
    }
    
}
