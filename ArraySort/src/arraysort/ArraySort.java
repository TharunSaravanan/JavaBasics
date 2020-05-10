/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class ArraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of array");
        int length = in.nextInt();

        int[] numbers = new int[length];

        for (int k = 0; k < numbers.length; k++) {
            int c = k + 1;
            System.out.println("Enter item " + c);
            numbers[k] = in.nextInt();
        }

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    
                    int temp = numbers[i];
                    
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        
        //printing the sorted array
        System.out.println("The sorted array is" );
        for (int l = 0; l < numbers.length; l++ ) {
            
            System.out.println(numbers[l] );
        }
        

    }
}
