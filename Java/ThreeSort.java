package Java;

/* This is a very basic exercise from the course Computer Science: Programming with a Purpose from Princeton University on Coursera
    It requires us to build the program by not using loops, conditions etc., only primitives and Math collection
 */

public class ThreeSort {
    static void main(String[] args) {
/*
Three-sort. Write a program that takes three integer command-line arguments and prints them in ascending order.
In order to execute this, you'll need to run: javac Java/ThreeSort.java
Then you'll run: java Java/ThreeSort followed by the three numbers you want to sort out, separated by spaces
 */
        int n1 =  Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        int min = Math.min(Math.min(n1, n2), n3);
        int max = Math.max(Math.max(n1, n2), n3);
        int mid = n1 + n2 + n3 - (min + max);

        System.out.println("Ordered numbers: " + min + " " + mid + " " + max);
    }
}
