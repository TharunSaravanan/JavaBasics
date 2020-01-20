/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.series;

import java.util.Scanner;

/**
 * Calculates the sum of first "n" numbers
 * Calculates the sum of first "n" odd and even numbers
 * @author tharun
 */
public class SumSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number");
        int count = in.nextInt();
        
        int sum = 0;
        
        for (int num = 0; num <= count; num++){
            sum = sum + num;
            
        }
        
        System.out.println("sum of first " + count + " numbers =" + sum);
        int sumeven = 0;
        
        int sumodd = 0;
                
             
        for (int num = 1; num <= count*2; num++){
            
            if (num % 2  == 0)
                sumeven = sumeven + num;
            else 
                sumodd = sumodd + num;

        }
        
        System.out.println("sum of even numbers =" + sumeven);
        System.out.println("sum of odd numbers =" + sumodd);
         
          
        
              
        

    }
    
}
