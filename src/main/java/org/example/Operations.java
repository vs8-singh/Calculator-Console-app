package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Operations {

    public static void add(Scanner in, Stack<String> history){
        System.out.println("Please provide 2 numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double ans = a+b;
        history.push("add ( "+a+" , "+b+" ) -> "+ans);
        System.out.println(ans);

    }

    public static void subtract(Scanner in, Stack<String> history){
        System.out.println("Please provide 2 numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double ans = a-b;
        history.push("subtract ( "+a+" , "+b+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void multiply(Scanner in, Stack<String> history){
        System.out.println("Please provide 2 numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double ans = a*b;
        history.push("multiply ( "+a+" , "+b+" ) -> "+ans);
        System.out.println(ans);
    }
    public static void divide(Scanner in, Stack<String> history){
        System.out.println("Please provide 2 numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double ans = a/b;
        history.push("divide ( "+a+" , "+b+" ) -> "+ans);
        System.out.println(ans);
    }
    public static void sin(Scanner in, Stack<String> history){
        System.out.println("Please provide a numbers: ");
        double a = in.nextDouble();
        Double ans = Math.sin(a);
        history.push("sin ( "+a+" ) -> "+ans);
        System.out.println(ans);
    }
    public static void cosine(Scanner in, Stack<String> history){
        System.out.println("Please provide a numbers: ");
        double a = in.nextDouble();
        Double ans = Math.cos(a);
        history.push("cosine ( "+a+" ) -> "+ans);
        System.out.println(ans);
    }
    public static void factorial(Scanner in, Stack<String> history){
        System.out.println("Please provide a number: ");
        double a = in.nextDouble();
        long ans = 1;
        for(int i = 1; i<=a; i++){
            ans = ans * i;
        }
        history.push("factorial ( "+a+" ) -> "+ans);
        System.out.println(ans);
    }
    public static void root(Scanner in, Stack<String> history){
        System.out.println("Please provide a number: ");
        double a = in.nextDouble();
        Double ans = Math.sqrt(a);
        history.push("root ( "+a+" ) -> "+ans);
        System.out.println(ans);
    }
    public static void exponential(Scanner in, Stack<String> history){
        System.out.println("Please provide a numbers: ");
        double a = in.nextDouble();
        Double ans = Math.exp(a);
        history.push("exponential ( "+a+" ) -> "+ans);
        System.out.println(ans);
    }
    public static void log(Scanner in, Stack<String> history){
        System.out.println("Please provide a numbers: ");
        double a = in.nextDouble();
        Double ans = Math.log(a);
        history.push("log ( "+a+" ) -> "+ans);
        System.out.println(ans);
    }

    public static void percentage(Scanner in, Stack<String> history){
        System.out.println("Please the total number: ");
        Double a = in.nextDouble();
        System.out.println("Please the 'out of' number: ");
        Double b = in.nextDouble();
        Double ans = (b/a)*100;
        history.push("percentage ( "+b+" out of "+a+" ) -> "+ans);
        System.out.println(ans);
    }

}
