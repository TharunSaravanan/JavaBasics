/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leasttogreatestarraysort;

/**
 *
 * @author tharun
 */
public class LeastToGreatestArraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[] {25, 34, 12, 36, 4745, 23455, 2344, 2, 346, -4};
        
        for (int i = 0; i < numbers.length - 1; i++){

            for (int j = i + 1; j < numbers.length; j++){

                if(numbers[i] > numbers[j])
                {
                    int temp = numbers[i];  
                    numbers[i] = numbers[j];
                    numbers[j] = temp;                     
                }     
            }  
        }
        
        for (int k = 0; k < numbers.length; k++){
            
            System.out.println(numbers[k]);
        }
        
    }
    
}
