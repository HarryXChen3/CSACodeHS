package codehs.unit_7._2;

import java.util.ArrayList;

public class Exercise_7_2_9 {
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
        //Add the static methods here:
        public static String getLastStudent() {
            return classList.get(classList.size() - 1).getName();
        }

        public static int getClassSize() {
            return classList.size();
        }

        public static void addStudent(final int index, final Student student) {
            classList.add(index, student);
            classList.remove(classList.size() - 1);
        }

        public static String getStudent(final int index) {
            return classList.get(index).getName();
        }

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

        System.out.println(Student.getLastStudent());
        System.out.println(Student.getStudent(1));

        Student.addStudent(2, new Student("Trevor", 12));
        System.out.println(Student.printClassList());
        System.out.println(Student.getClassSize());
    }
}
