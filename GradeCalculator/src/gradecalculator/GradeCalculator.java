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
        double number = in.nextDouble();
        
        // compute grade
        String grade = "";
        if (number >= 90)
            grade = "A";
        else if (number >= 80)
            grade = "B";
        else if (number >= 70)
            grade = "C";
        else if (number >= 60)
            grade = "D";
        else 
            grade = "F";
        
        // print mark
       System.out.println("Your mark is " + number);
       
       // print grade
       System.out.println("Your grade is " + grade);
    }
    
}
