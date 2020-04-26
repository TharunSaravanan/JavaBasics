/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortedarrays;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class MergeSortedArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first array length ");
        int aLength = in.nextInt();
        
        System.out.println("Enter second array length ");
        int bLength = in.nextInt();

        int[] a = new int[aLength];

        int[] b = new int[bLength];
        
        // fill array a with odd numbers
        int aStart = 1;
        for(int i = 0; i < a.length; i++){
            a[i] = aStart;
            aStart += 2;
        }
        
        //fill b with even numbers
        int bStart = 2;
        for(int j = 0; j < b.length; j++){
            b[j] = bStart;
            bStart += 2;
        }
        
        // optimized method. compare elements while moving them to c
        // Runtime complexity - exponential O(m+n)
        int[] c = new int[a.length + b.length];
        
        int apointer = 0;
        int bpointer = 0;
                
        
        long start = System.currentTimeMillis();

        for (int i = 0; i < c.length; i++) {
            
            if (apointer == a.length) {         // if at the end of array "a"
                c[i] = b[bpointer];
                bpointer++;
            }   
            else if (bpointer == b.length) {    // if at the end of array "b"
                c[i] = a[apointer];
                apointer++;
                
            }
            else if (a[apointer] < b[bpointer]) {   //comparing value of next element in a/b
                c[i] = a[apointer];
                apointer++;      
            }
            else {
                c[i] = b[bpointer];
                bpointer++;
            }
            
        }
        
        long finish = System.currentTimeMillis();
        
        for (int l = 0; l < c.length; l++) {
            System.out.println(c[l]);
        }
        
        long timeElapsed = finish - start;
        System.out.println("Optimized method took " + timeElapsed + " milli seconds...");
        
        
        // Unoptimized method - copy a & b to c first and then sort c
        // Runtime complexity - exponential O(m+n)^2
        start = System.currentTimeMillis();
        int[] d = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            d[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            d[j + a.length] = b[j];
        }

        for (int k = 0; k < d.length; k++) {

            for (int f = k + 1; f < d.length; f++) {

                if (d[k] > d[f]) {
                    int temp = d[k];
                    d[k] = d[f];
                    d[f] = temp;
                }
            }
        }
        
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Unoptimized method took " + timeElapsed + " milli seconds...");

    }

}
