/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculatorarray;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class GradeCalculatorArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Asking for number grade
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number grade");
        double score = in.nextDouble();
        
        // Array for grade numbers        
        double[] gradeScores = new double[]{60, 63, 67, 70, 73, 77, 80, 83, 87, 90, 93, 97, 100};
        
        // Array for corresponding grades
        String[] grades = new String[]{"F", "D-", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A", "A+"};
        
        // Loop through gradeScores Array
        for(int i = 0; i < gradeScores.length; i++){
            
            // Comparing gradeScore to corresponding letter grade
            if(score <= gradeScores[i]){
                
                // Print grade, then exit process to avoid extras
                System.out.println("Grade = "+ grades[i]);
                
                break;
            }
            
        }
    }
    
}
