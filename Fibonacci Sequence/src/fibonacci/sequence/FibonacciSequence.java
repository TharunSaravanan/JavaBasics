/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.sequence;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter count");
        int count = in.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        
        for(int i = 1; i<= count; i++){
            System.out.println(n1);
            
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        
        
        
        
        
    }
    
}
