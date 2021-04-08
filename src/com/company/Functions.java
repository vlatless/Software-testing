package com.company;

import java.math.BigInteger;
import java.lang.Math;
import java.util.Arrays;

public class Functions {
    final static int maxSeriesCount = 30;

    public double factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    public double decomposeArcSin(double value) {
        if(value > 1 || value < -1) return  Double.NaN;
        double sum = 0.0;
        for(int n = 0; n < maxSeriesCount; n++) {
            sum +=
             (
                    (factorial(2*n) * Math.pow(value, 2 * n + 1))
                            /
                    (Math.pow(4,n) * Math.pow(factorial(n),2) * (2 * n + 1))
             )  ;
        }
        return sum;
    }

    public double decomposeArcCos(double value) {
        if(value > 1 || value < -1) return  Double.NaN;
        return (Math.PI / 2) - (decomposeArcSin(value));
    }

    public int[] shellSort(int[] array) {
        if(array.length < 2) return array;
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
        return array;
    }
 }
