import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    // function to checkPalindrome

    public void checkPalindrome() {
        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        int Num1 = num;
        int Num2 = 0;

        while (Num1 != 0) {
            int digit = Num1 % 10;
            Num1 /= 10;
            Num2 = Num2 * 10 + digit;
        }

        if (Num2 == num)
            System.out.println(num + " is palindrome");
        else
            System.out.println(num + " is not palindrome");

    }

    // function to printPattern

    public void printPattern() {
        System.out.println("Enter the number of rows you want to print: ");

        int rows = sc.nextInt();

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    // function to check no is prime or not

    public void checkPrimeNumber() {
        int temp;
        boolean isPrime = true;
        System.out.print("Enter a number you want to check: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");

    }

    // function to print Fibonacci Series

    public void printFibonacciSeries() {

        int n = 10, first = 0, second = 1;
        System.out.print(first + " " + second);
        for (int i = 3; i <= n; i++) {
            int term = first + second;
            System.out.println(" " + term);
            first = second;
            second = term;
        }

    }

    // main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();

            switch (choice) {

                case 0:

                    choice = 0;

                    break;

                case 1: {

                    obj.checkPalindrome();

                }

                    break;

                case 2: {
                    obj.printPattern();

                }

                    break;

                case 3: {

                    obj.checkPrimeNumber();

                }

                    break;
                case 4: {
                    obj.printFibonacciSeries();

                }

                    break;

                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }

        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }
}
