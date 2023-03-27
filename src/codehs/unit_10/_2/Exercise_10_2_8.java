package codehs.unit_10._2;

import java.util.Arrays;

public class Exercise_10_2_8 {
    @SuppressWarnings("InnerClassMayBeStatic")
    public class BinarySearchTest {

        static int count;

        public static void output(int s, int m, int a) {
            System.out.println("Array Size: " + s);
            System.out.println("Max iterations: " + m);
            System.out.println("Actual iterations: " + a);
        }

        public static void main(String[] args) {

            // Use the helper code to generate arrays, calculate the max
            // iterations, and then find the actual iterations for a randomly
            // selected value.
            final int length1 = 100;
            final int length2 = 1000;
            final int length3 = 10000;
            final int length4 = 100000;

            final int[] array1 = generateArrayOfLength(length1);
            final int[] array2 = generateArrayOfLength(length2);
            final int[] array3 = generateArrayOfLength(length3);
            final int[] array4 = generateArrayOfLength(length4);

            count = 0;
            binaryRec(array1, array1[45], 0, length1 - 1);
            output(length1, binaryMax(length1), count);

            count = 0;
            binaryRec(array2, array2[450], 0, length2 - 1);
            output(length2, binaryMax(length2), count);

            count = 0;
            binaryRec(array3, array3[4500], 0, length3 - 1);
            output(length3, binaryMax(length3), count);

            count = 0;
            binaryRec(array4, array4[450], 0, length4 - 1);
            output(length4, binaryMax(length4), count);
        }

        public static int binaryRec(int[] array, int target, int begin, int end) {
            if (begin <= end)
            {
                int mid = (begin + end) / 2;
                count ++;
                // Base Case
                if (target == array[mid]) {
                    return mid;
                }

                if (target < array[mid]) {
                    return binaryRec(array, target, begin, mid - 1);
                }

                if (target > array[mid]) {
                    return binaryRec(array, target, mid + 1, end);
                }
            }
            return -1; //Alternate Base Case - not found
        }

        public static int[] generateArrayOfLength(int length)
        {
            int[] arr = new int[length];
            for(int i = 0; i < length; i++)
            {
                arr[i] = (int)(Math.random() * 100);
            }

            Arrays.sort(arr);

            return arr;
        }

        private static int binaryMax(int length) {
            return (int) (Math.log(length) / Math.log(2)) + 1;
        }
    }
}
