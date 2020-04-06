/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjumpelements;

/**
 *
 * @author tharun
 */
public class ArrayJumpElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare array of 100 elements
        int numbers[] = new int[100];
        
        //fill elements
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }
        
        //print every other element
        for(int i = 0; i < numbers.length; i = i + 2){
            System.out.println(numbers[i]);
        }
        
        //print every 3rd element
        for(int i = 0; i < numbers.length; i = i + 3){
            System.out.println(numbers[i]);
        }
        
    }
    
}
    
    
    

