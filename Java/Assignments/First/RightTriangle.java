package Java.Assignments.First;

// Integers and booleans. Write a program RightTriangle that takes three int command-line arguments and determines
// whether they constitute the side lengths of some right triangle.
// The following two conditions are necessary and sufficient:
// Each integer must be positive.
// The sum of the squares of two of the integers must equal the square of the third integer.

public class RightTriangle {
    public static void main(String[] args){
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        boolean isRightTriangle = side1 > 0 && side2 > 0 & side3 >0 &&
                (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)
                || Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)
                || Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2));

        System.out.println(isRightTriangle);
    }
}
