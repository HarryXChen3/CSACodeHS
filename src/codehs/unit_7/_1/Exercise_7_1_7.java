package codehs.unit_7._1;

import java.util.ArrayList;

public class Exercise_7_1_7 {
    public static final class ClassicCar
    {
        String name;
        String model;
        int cost;

        public ClassicCar(String name, String model, int cost)
        {
            this.name = name;
            this.model = model;
            this.cost = cost;
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        //Initialize your ArrayList here:
        final ArrayList<ClassicCar> garage = new ArrayList<ClassicCar>();
    }
}
