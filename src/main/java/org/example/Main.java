package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] data = { 5, 2, 9, 0, 5, 2};
        System.out.print("Unsorted Array: ");
        showArray(data);

        //Loop and find max in the array and that would be k
        int [] out;
        out = countingsort(data, 9);
        System.out.print("Sorted Array: ");
        showArray(out);
        System.out.println();
    }


    public static void showArray(int[] a) {
       for(int i = 0; i < a.length; i++) {
           System.out.print(a[i] + " ");
       }
       System.out.println();
    }

    public static int[] countingsort(int[] in, int k) {
        int[] count = new int[k + 1];
        int[] out = new int[in.length];


        for(int i = 0; i <= in.length - 1; i++) {
            int currItem = in[i];
            count[currItem]++;
        }

        for(int i =1; i <= k; i++ ) {
            count[i] = count[i] + count[i - 1];
        }

        for(int i = in.length - 1; i >= 0; i--) {
            int currItem = in[i];
           count[currItem]--;
            out[count[currItem]] = currItem;
        }
        return out;
    }

//    public static int genRandDataArray(int numItems, int max) {
//        Random rand = new Random();
//        int[] data = new int[numItems];
//        for(int i = 0; i < numItems; i++) {
//            data[i] = rand.nextInt(max + 1);
//        }
//        return data;
//    }





 }