import java.util.Scanner;

public class while_for_loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //1.Write a program that prints the numbers from 1 to 100 such that:

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //2.Write a Java program to reverse a string.

        System.out.println("\nString Reverser");

        System.out.print("Input a string: ");
        String strReverse = input.nextLine();

        int x = strReverse.length() - 1;
        while (x >= 0) {
            System.out.print(strReverse.charAt(x));
            x--;
        }
        System.out.println(" ");

        //3.Write a program to find the factorial value of any number entered
        //through the keyboard.

        System.out.println("\nFactorial value");
        System.out.println("Find the factorial value of a number, enter -1 to quit.");

        int num;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num == 0) {
                System.out.println("The value of 0! = 1");
            } else if (num < -1) {
                System.out.println("\"Factorial value can only be counted for a positive number.\"\nTry again!");
            } else if (num > 0){
                long total = 1L;
                for (int i = 2; i <= num; i++) {
                    total = total * i;
                }
                System.out.println("The value of "+ num + "! = " + total);
            }
        } while (num != -1);

        //4.Two numbers are entered through the keyboard. Write a program to find
        //the value of one number raised to the power of another. (Do not use Java
        //built-in method)

        System.out.println("\nNumbers raised to a power");
        System.out.println("Find the value of one number raised to the power of another number.");

        System.out.print("Enter the 1st number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int powerNum = input.nextInt();

        if (powerNum == 0) {
            System.out.println("The value of " + firstNum + "^0 = 1");
        } else {
            int powerTotal = firstNum;
            for (int i = 2; i <= powerNum; i++) {
                powerTotal = powerTotal * firstNum;
            }
            System.out.printf("The value of %d^%d = %d\n", firstNum, powerNum, powerTotal);
        }

        //5.Write a program that reads a set of integers, and then prints the sum of
        //the even and odd integers.


        System.out.println("\nSum of even and odd integers");
        System.out.println("Calculate and print the sum of the even and the odd numbers for a set of integers.");
// set of integers input from user as a string, should be entered with spaces between them as the following example: 9 8 9 6

        int intNum;
        int sumOfOdd = 0;
        int sumOfEven = 0;
        do {
            System.out.print("Enter an integer, or 0 to quit: ");
            intNum = input.nextInt();
            if (intNum == 0){
                break;
            }
            else if(intNum % 2 == 0){
                sumOfEven += intNum;
            }
            else{
                sumOfOdd += intNum;
            }
        } while (intNum != 0);

        System.out.println("Sum of the even integers: " + sumOfEven);
        System.out.println("Sum of the odd integers: " + sumOfOdd);

        //6.Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime
        //number.

        System.out.println("\nPrime numbers");
        System.out.println("Enter a number to indicate if it is a prime number or not.");
        System.out.print("Enter a number: ");
        int primeNum = input.nextInt();
        // in this code, I assume that the number entered from the user is prime until proven otherwise
        boolean isPrimeNum = true;

        for (int i = 2; i < primeNum && i <=7; i++){
            if (primeNum % i == 0){
                isPrimeNum = false;
                break;
            }
        }

        if (isPrimeNum){
            System.out.println(primeNum + " is a prime number.");
        }
        else{
            System.out.println(primeNum + " is not a prime number.");
        }

        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.

        System.out.println("\nPrint the heading of four weeks with the days");

        for (int i =1; i<=4; i++){
            System.out.println(" ");
            System.out.println("Week " + i);
            for (int j= 1; j<=7; j++){
                System.out.println("Day"+j);
            }
        }

        //8.Write a program thats check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left.

        System.out.println("\nPalindrome word");
        System.out.println("Enter a word to check if it is a palindrome word");
        System.out.print("Enter a word: ");
        String paliWord = input.next();

        
        int g = paliWord.length() - 1;
        String revWord = "";
        while (g >= 0) {
            revWord += paliWord.charAt(g);
            g--;
        }

        if (paliWord.equals(revWord)){
            System.out.print(paliWord + " is a palindrome word.");
        }
        else{
            System.out.print(paliWord + " is not a palindrome word.");
        }

    }
}