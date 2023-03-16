package basics;

import java.util.Arrays;

class MyArrays {
    public static void main(String[] args) {

        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i * 2;
        }

        int[] numArr2 = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr2[i] = 10 - i;
        }

        int[][] arr = new int[4][4];

        // arr.length
        System.out.println("length: " + numArr.length);

        // toString method
        System.out.println("print arr : ");
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(numArr2));

        // returns index
        System.out.println("index of 4 in numArr: " +
                Arrays.binarySearch(numArr, 4));

        // to print 2D array as string
        System.out.println("deepToString() : ");
        System.out.println(Arrays.deepToString(arr));

        // to sort array
        Arrays.sort(numArr2);
        System.out.println(Arrays.toString(numArr2));

        // to calc sum : convert to stream
        System.out.println("Sum: " + Arrays.stream(numArr).sum());

    }
}