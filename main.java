import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

//needed for code to run
    public static void main(String[] args){

        System.out.println("I like pizza");
        System.out.println("It's really good");
        System.out.println("Buy me pizza");


//        Variables = a reusable container for a value
//                    a variable behaves as if it was the value it contains

//        primitive = simple value stored directly in memory (stack)
//        reference = memory address (stack) that points to the (heap)

//        primitive: int, double (not whole numbers), char (single character), boolean
//        reference: string, array, object

//        2 steps to creating a valiable, 1. declaration, 2. asssignment

//        camelCase for variable names

//        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
//        double gpa = 3.5;
        double temperature = 23.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

//        String name = "Butt";
        String food = "pizza";
        String email = "email@email.com";

//        System.out.println("Your choice is a " + grade + " " + year);
//        System.out.println(" ");
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
//
//        System.out.println("Enter you age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("what is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.println("Your name is: " + name);
//        System.out.println("You are " + age + " years old.");
//        System.out.println("Your gpa is: " + gpa);
//        scanner.close();

//        create scanner object


        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area);

        scanner.close();

    }
}

