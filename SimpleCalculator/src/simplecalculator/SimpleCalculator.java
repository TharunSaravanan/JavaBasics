/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.util.Scanner;
import simplecalculator.Math;
import static simplecalculator.Math.add;
import static simplecalculator.Math.divide;
import static simplecalculator.Math.multiply;
import static simplecalculator.Math.subtract;

/**
 *
 * @author tharun
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first number");
        double first = in.nextDouble();
        
        System.out.println("Enter operator (+,-,*,/) ");
        String operator = in.next();
        
        System.out.println("enter second number");
        double second = in.nextDouble();
        
        double result = 0;
        if (operator.equals("+"))
            result = add (first, second);
        else if (operator.equals("-"))
            result = subtract (first, second);
        else if (operator.equals("*"))
            result = multiply (first, second);
        else if (operator.equals("/"))
            result = divide (first, second);
        else 
            System.out.println("Sorry; invalid operator");
        
        System.out.println(first + " " + operator + " " + second + " = " + result);
          
        
    }
    

    
}
