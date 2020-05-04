/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxandmininarray;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class MaxAndMinInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of array");
        int length = in.nextInt();

        int[] numbers = new int[length];

        for (int j = 0; j < numbers.length; j++) {
            int c = j + 1;
            System.out.println("Enter item " + c);
            numbers[j] = in.nextInt();
        }

        int smallest = numbers[0];
        int biggest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }

        System.out.println("Largest Number is : " + biggest);
        System.out.println("Smallest Number is : " + smallest);

    }

}
