package codehs.unit_7._2;

import java.util.ArrayList;

public class Exercise_7_2_8 {
    @SuppressWarnings("unused")
    public static final class Student
    {
        private final String name;
        private final int grade;
        //Implement classList here:
        private static final ArrayList<Student> classList = new ArrayList<>();

        public Student(String name, int grade)
        {
            this.name = name;
            this.grade = grade;
            classList.add(this);
        }

        public String getName()
        {
            return this.name;
        }

        /*Don't change the code in this method!
        This method will print out all the Student names in the classList Array
        */
        public static String printClassList()
        {
            final StringBuilder names = new StringBuilder();
            for (Student name: classList) {
                names.append(name.getName()).append("\n");
            }
            return "Student Class List:\n" + names;
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        //You don't need to change anything here, but feel free to add more Students!
        Student alan = new Student("Alan", 11);
        Student kevin = new Student("Kevin", 10);
        Student annie = new Student("Annie", 12);
        System.out.println(Student.printClassList());
    }
}
