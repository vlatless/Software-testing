package com.company.Tests;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.company.Functions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;


public class FunctionUnitTests {
    private Functions functions = new Functions();

    @Test
    public void CheckArcCosSeries() {
        assertEquals(Double.NaN, functions.decomposeArcCos(-1.1), 0.01);
        assertEquals(3.0384465595315406, functions.decomposeArcCos(-1), 0.01);
        assertEquals(2.690553750207715, functions.decomposeArcCos(-0.9), 0.01);
        assertEquals(2.0943951023931957, functions.decomposeArcCos(-0.5), 0.01);
        assertEquals(1.5707963267948966, functions.decomposeArcCos(0), 0.01);
        assertEquals(1.0471975511965974, functions.decomposeArcCos(0.5), 0.01);
        assertEquals(0.4510389033820783, functions.decomposeArcCos(0.9), 0.01);
        assertEquals(0.10314609405825248, functions.decomposeArcCos(1), 0.01);
        assertEquals(Double.NaN, functions.decomposeArcCos(1.1), 0.01);
    }

    @Test
    public void CheckShellSort() {
        Random rd = new Random();
        int commonArraysLength = 100;
        int[] arr = new int[commonArraysLength];
        int[] arr2 = new int[commonArraysLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        arr2 = functions.shellSort(arr2);

        for (int i = 0; i < commonArraysLength; i++) {
            assertEquals(arr[i], arr2[i]);
        }

        int[] sortedStaticArray = functions.shellSort(new int[] {9,1,8,2,7,3,4,6,5,0});
        int[] manualSortedStaticArray = new int[] {0,1,2,3,4,5,6,7,8,9};
        int arr3Length = sortedStaticArray.length;
        for(int i = 0; i < arr3Length; i++) {
            assertEquals(sortedStaticArray[i], manualSortedStaticArray[i]);
        }
    }
}
