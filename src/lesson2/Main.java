package lesson2;

import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {
            //задание 1
            int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println();

            //задание 2
            int[] arr1 = new int[8];
            int j = 0;
            for (int i = 0; i < arr1.length; i++, j = j + 3) {
                arr1[i] = j;
            }
            System.out.println(Arrays.toString(arr1));
            System.out.println();

            //задание 3
            int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] < 6) {
                    arr2[i] = arr2[i] * 2;
                }
            }
            System.out.println(Arrays.toString(arr2));
            System.out.println();

            //задание 4
            int length = 5; // length of array
            int[][] arr4 = new int[length][length];
            for (int i = 0; i < length; i++) {
                for (int z = 0; z < length; z++) {
                    if ((i == z) || (i == length - 1 - z)) {
                        arr4[i][z] = 1;
                    }
                }
            }
            for (int i = 0; i < length; i++) {
                for (int z = 0; z < length; z++) {
                    System.out.print(arr4[i][z] + " ");
                }
                System.out.println();
            }
        }
    }
