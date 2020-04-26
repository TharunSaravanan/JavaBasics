/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnnumbers;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class SumOfNNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long sum = 0;
         Scanner in = new Scanner(System.in);

        System.out.println("Enter amount of numbers desired ");
        long n = in.nextLong();
        
        long start = System.currentTimeMillis();
        
        for (long i = 1; i <= n; i++) {
            
            if (i % 10000 == 0)
                System.out.println("Processing " + i + "th number..");
            
            sum = i + sum;
        }
                
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        
        System.out.println("The sum of the first " + n + " numbers is " + sum);
        System.out.println("Unoptimized method took " + timeElapsed + " milli seconds...");

        
        start = System.currentTimeMillis();
        
        sum = n*(n+1)/2;
        
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;

        System.out.println("The sum of the first " + n + " numbers is " + sum);
        System.out.println("Optimized method took " + timeElapsed + " milli seconds...");
        
    }
    
}
