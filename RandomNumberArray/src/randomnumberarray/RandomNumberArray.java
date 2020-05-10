/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumberarray;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author tharun
 */
public class RandomNumberArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random(); 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter length of array");
        int length = in.nextInt();

        int[] numbers = new int[length];
        
        for (int i = 0; i < numbers.length; i++) {
         numbers[i] = rd.nextInt(101010); 
         System.out.println(numbers[i]);
         
        }
    }
    
}
