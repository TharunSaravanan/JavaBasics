/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number grade");
        
        double score = in.nextDouble();
        
        double[] gradeNumbers = new double[]{60, 70, 80, 90, 100};
        
        String[] gradeLetters = new String[]{"F", "D", "C", "B", "A",};
        
        for(int i = 0; i < gradeNumbers.length; i++){
            
            if(score <= gradeNumbers[i]){
                
                System.out.println("Grade = "+ gradeLetters[i]);
                
                break;
            }
            
        }
    }
    
}
