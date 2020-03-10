package com.dgtal_cat.app;

//import java.util.Random;

public class minChecker {
    public static double checkMin(double a, double b) {

//        Random rand = new Random();

       /* double a = rand.nextDouble();
        double b = rand.nextDouble();
        double result = 0;*/
        double result = Math.min(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("min is " + result);
        return result;
    }
        }
