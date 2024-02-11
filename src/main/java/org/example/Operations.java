package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Operations {

    public static void add(Scanner in, Stack<String> history){
        System.out.println("Please provide the two numbers: ");
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        double ans = a+b;
        history.push("add( "+a+" , "+b+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void subtract(Scanner in, Stack<String> history){
        System.out.println("Please provide the two numbers: ");
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        double ans = a-b;
        history.push("subtract( "+a+" , "+b+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void multiply(Scanner in, Stack<String> history){
        System.out.println("Please provide the two numbers: ");
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        double ans = a*b;
        history.push("multiply( "+a+" , "+b+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void divide(Scanner in, Stack<String> history){
        System.out.println("Please provide the two numbers: ");
        try{
            Double a = in.nextDouble();
            Double b = in.nextDouble();
            double ans = a/b;
            history.push("divide( "+a+" , "+b+" ) -> "+ans);
            System.out.println(ans);
        }catch (ArithmeticException a){
            System.out.println("Cannot divide by zero. Please provide valid values : ");
            divide(in,history);
        }
    }

    public static void sin(Scanner in, Stack<String> history){
        System.out.println("Please provide the number: ");
        double a = in.nextDouble();
        double ans =  Math.sin(a);
        history.push("sin( "+a+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void cosine(Scanner in, Stack<String> history){
        System.out.println("Please provide the number: ");
        double a = in.nextDouble();
        double ans =  Math.cos(a);;
        history.push("cosine( "+a+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void factorial(Scanner in, Stack<String> history){
        System.out.println("Please provide the number: ");
        int a = in.nextInt();
        long ans = 1;
        for(long i = 1; i<=a; i++){
            ans = ans * i;
        }
        history.push("factorial( "+a+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void root(Scanner in, Stack<String> history){
        System.out.println("Please provide the number: ");
        double a = in.nextDouble();
        double ans =  Math.sqrt(a);
        history.push("root( "+a+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void exponential(Scanner in, Stack<String> history){
        System.out.println("Please provide the number: ");
        double a = in.nextDouble();
        double ans =  Math.exp(a);
        history.push("exponential( "+a+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void log(Scanner in, Stack<String> history){
        System.out.println("Please provide the number: ");
        double a = in.nextDouble();
        double ans = Math.log(a);
        history.push("log( "+a+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void percentage(Scanner in, Stack<String> history){
        System.out.println("Please provide the total number: ");
        double b = in.nextDouble();
        System.out.println("Please provide the 'out of' number: ");
        double a = in.nextDouble();
        double ans = (a/b)*100;
        history.push("percentage( "+a+" out of "+b+" ) -> "+ans);
        System.out.println(ans);
    }
}
