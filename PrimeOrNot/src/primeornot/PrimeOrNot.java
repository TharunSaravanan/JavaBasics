/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeornot;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class PrimeOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = in.nextInt();
        boolean isPrime = true;
        
        for(int i = 2; i <= n/2; i++){
            
            //System.out.println("Checking if number is divisible by  " + i);
            
            if (n % i == 0){
               
                isPrime = false;
                break;
            }
        }
        
        if (isPrime == true){
            System.out.println(" Success! " +n +" is prime!");
        }
        else {
            System.out.println("oops! " +n +" is not prime :(");
        }
    
    }
}
