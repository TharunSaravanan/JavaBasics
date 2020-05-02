/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageofarray;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class AverageOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of array");
        int length = in.nextInt();
        
        int[] numbers = new int[length];
        
        for (int j = 0; j < numbers.length; j++){
            int c = j+1;
            System.out.println("Enter item " + c);
            numbers[j] = in.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        
        double average = sum / numbers.length;
        
        System.out.println("The Average is " + average);
    }
    
}
