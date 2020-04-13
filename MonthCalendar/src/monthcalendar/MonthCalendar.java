/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthcalendar;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class MonthCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Month Number");
        int a = in.nextInt();
        
        // Days for each month in *2020*
        int[] daysInMonth = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
         
            // Days for each week from start of January
        String[] days = new String[]{"Wednesday", "Thrusday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        
        int firstDay = 0;
        
        // Finding numbers of days between January 1 and first day of given month
        for(int i = 0; i < a-1; i++){    
              firstDay= firstDay + daysInMonth[i];         
        }
        
        int lastDay = firstDay + daysInMonth[a - 1];
        int date = 1;
        
        for(int i = firstDay; i < lastDay; i++){
        
                      
            // finding what
            int d = i % 7;
            
            String dayName = days[d];
            
            System.out.println(date +" => " + dayName);
            date++;
            
        }
        
    }
    
}
