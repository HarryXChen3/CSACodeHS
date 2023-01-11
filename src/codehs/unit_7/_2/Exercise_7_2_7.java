package codehs.unit_7._2;

import java.util.ArrayList;

public class Exercise_7_2_7 {
    public static void main(String[] args)
    {
        // Create the evens ArrayList
        final ArrayList<Integer> evens = new ArrayList<>(100);
        for (int i = 100; i <= 300; i+=2) {
            evens.add(i);
        }

        printArray(evens);
    }


    //Don't alter this method! It will print your array in the console
    public static void printArray(ArrayList<Integer> array)
    {
        System.out.println("Array:");
        for(int name: array)
        {
            System.out.print(name + " ");
        }
    }
}
