/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoarraycomparison;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class TwoArrayComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of first array");
        int length = in.nextInt();

        int[] a = new int[length];

        for (int k = 0; k < a.length; k++) {

            int c = k + 1;

            System.out.println("Enter item " + c);

            a[k] = in.nextInt();

        }

        System.out.println("Enter length of Second array");
        int length2 = in.nextInt();

        int[] b = new int[length2];

        for (int l = 0; l < b.length; l++) {

            int c = l + 1;

            System.out.println("Enter item " + c);

            b[l] = in.nextInt();

        }

        if (a.length != b.length) {
            System.out.println("Two Arrays Are Not equal");
            return;
        }
        
        boolean equalOrNot = true;

        for (int i = 0; i < a.length; i++) {
            
            boolean isFound = false;
            
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[i]) {
                    isFound = true;
                }
            }
            
            if (isFound == false){
                equalOrNot = false;
                break;
            }    
        }

        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
