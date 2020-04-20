/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysearch;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class ArraySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers = new int[] {5, 10, 15, 20, 25};
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int number = in.nextInt();
        boolean isFound = false;
        
        for (int i = 0; i < numbers.length; i++){
            
            if( number == numbers[i] ){
                // number found in array
                System.out.println("Number found in location "+ i); 
                isFound = true;// set flag to true to avoid extra text
                break;
            }
        
        }  
        
        // print only if number is not found        
        if(isFound == false){
            System.out.println("your number was not found in the array");
        }
    }
    
}
