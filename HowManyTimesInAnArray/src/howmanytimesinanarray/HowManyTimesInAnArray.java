/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howmanytimesinanarray;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class HowManyTimesInAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] n = new int[]{5, 5, 10, 10, 10, 15, 20, 20, 20, 25};
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number to search");
        int numberToSearch = in.nextInt();
        
        int count = 0;

        for (int i = 0; i < n.length; i++) {

            if (n[i] == numberToSearch) {
                count++;
            }
        }
        
        System.out.println("Number of Occurrence of the Element: " + count);

    }

}
