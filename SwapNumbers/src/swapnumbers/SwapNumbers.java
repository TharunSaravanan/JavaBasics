/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapnumbers;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class SwapNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a");
        int a = in.nextInt();

        System.out.println("Enter b");
        int b = in.nextInt();

        /*int temp = b;
        
        b = a;
        
        a = temp;
        
        // For the easier method
        */
        
        a = a+b;
        
        b = a-b;
        
        a = a-b;
              
        
        System.out.println("a =" +a + " b =" +b);
        
        
    }
    
}
