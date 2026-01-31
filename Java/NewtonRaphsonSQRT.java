package Java;

import java.util.Scanner;

public class NewtonRaphsonSQRT {
    void main(String[] args){
        IO.println("Aprox. square root: " + sqrt(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }

    double  sqrt(double num, int precision){
        //
        double t = num;
        double ti = t;

        for (int i = 0; i <= precision; i++) {
            if (t == num / ti){
                return ti;
            }
            ti = ((ti + num/ti) / 2);
        }

        return ti;
    }
}
