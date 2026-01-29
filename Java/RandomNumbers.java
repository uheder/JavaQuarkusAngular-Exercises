package Java;

/* This is a very basic exercise from the course Computer Science: Programming with a Purpose from Princeton University on Coursera
    It requires us to build the program by not using loops, conditions etc., only primitives and Math collection
 */

public class RandomNumbers {
    public static void main(String[] args) {
//        Write a program that prints five uniform random numbers between 0 and 1, their average value, and their minimum and maximum values.
        double n1 = Math.random();
        double n2 = Math.random();
        double n3 = Math.random();
        double n4 = Math.random();
        double n5 = Math.random();



        double media = (n1+n2+n3+n4+n5)/5;
        double min = Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5);
        double max = Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5);

        System.out.println("Numbers: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
        System.out.println("Media: " + media);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
