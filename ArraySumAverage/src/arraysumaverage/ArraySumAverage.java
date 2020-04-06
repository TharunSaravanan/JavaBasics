/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysumaverage;

/**
 *
 * @author tharun
 */
public class ArraySumAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers = new int[]{15,1399,135,25347,476,123,2352,354};
        
        float sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];  
        }
        
        float average = sum/numbers.length;
        
        System.out.println("Sum = "+ sum);
        System.out.println("Average = "+ average);
    }
    
}
