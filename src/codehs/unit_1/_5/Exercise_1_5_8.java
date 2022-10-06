package codehs.unit_1._5;

import java.util.Scanner;

public class Exercise_1_5_8 {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name': ");
        final String name = inputScanner.nextLine();
        System.out.println("Enter the title of the book: ");
        final String title = inputScanner.nextLine();
        System.out.println("Enter the publisher of the book: ");
        final String publisher = inputScanner.nextLine();
        System.out.println("Enter the year the book was published: ");
        final String publishYear = inputScanner.nextLine();

        System.out.println(name + ". " + title + ".\n" + publisher + ", " + publishYear + ".");
    }
}
