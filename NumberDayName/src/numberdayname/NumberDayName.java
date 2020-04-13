/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberdayname;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class NumberDayName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String[] days = new String[] {"Wednesday", "Thrusday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        
      
        
        for (int i = 1; i<=365; i++){
            
            int day = (i-1) % 7; 
            System.out.println("Day " + i + " -> " + days[day]);
            
            
        }
        
        
        
        
      
        
    }
    
}
