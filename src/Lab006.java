/**
 * @author Jason Carr
 * @date 3/1/2023
 */

import java.util.Scanner;

public class Lab006 { //Create a new class called Lab006
    //Create two integer instance variables for class Lab006 called n and m.
    int n;
    int m;

    //Create a constructor for class Lab006 that takes two integers, n and m and
    // assigns them to Lab006 instance variables
    public Lab006(int n, int m) {
    }


        /**
         * Write a public/instance method named, isDivisible, that references,
         * instance variables n and m, and returns true if n is evenly
         * divisible by m, and false otherwise.
         * @param n - the integer to test
         * @param m - the integer to test
         * @return true if n goes into m evenly, false otherwise
         */
        public static boolean isDivisible (int n, int m) {

            return n % m == 0;
        }

    public static void main(String[] args) {
        //In a static main method, prompt the user for two
        // integers and store those values into local variables.
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the value of n: ");
            int n = input.nextInt();

            System.out.print("Enter the value of m: ");
            int m = input.nextInt();

//Use the local variables as the arguments to the Lab006 constructor when creating a new Lab006 object.
            Lab006 lab = new Lab006(n, m);// Create an object of class Lab006 called lab.

            //Call isDivisible using a Lab006 object,
            // and be sure to have code that "handles" the returned value from isDivisible
            boolean isDivisible = lab.isDivisible(n, m);
            if (isDivisible) {
                System.out.println(isDivisible + " " + n + " is evenly divisible by " + m);
            } else {
                System.out.println(isDivisible + " " + n + " is not evenly divisible by " + m);
            }
        }
    }
}
