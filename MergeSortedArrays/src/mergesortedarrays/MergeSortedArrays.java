/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortedarrays;

/**
 *
 * @author tharun
 */
public class MergeSortedArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] a = new int[]{7, 25, 91, 175, 250};

        int[] b = new int[]{2, 13, 20, 70, 80};

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            c[j + a.length] = b[j];
        }

        for (int k = 0; k < c.length; k++) {

            for (int f = k + 1; f < c.length; f++) {

                if (c[k] > c[f]) {
                    int temp = c[k];
                    c[k] = c[f];
                    c[f] = temp;
                }
            }
        }

        for (int l = 0; l < c.length; l++) {
            System.out.println(c[l]);
        }

    }

}
