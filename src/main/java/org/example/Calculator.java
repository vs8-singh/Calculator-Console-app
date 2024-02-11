package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public void startCalculations(){
        System.out.println("Start Calculation");
        Scanner in = new Scanner(System.in);
        Stack<String> history = new Stack<>();
        showOptions(in,history);

    }

    private static void showOptions(Scanner in, Stack<String> history) {
        System.out.println("Choose an option :- \n" +
                "1. Perform calculation.\n" +
                "2. Show history\n" +
                "3. Exit");
        int option = in.nextInt();
        if(option == 1){
            System.out.println("Peforming calculations");
            calculate(in,history);
        } else if (option == 2) {
            System.out.println("Showing history");
            showHistory(history);
        } else if (option == 3) {

        }else{
            System.out.println("Please choose a valid option.");
            showOptions(in, history);
        }
    }

    private static void showHistory(Stack<String> history) {
        if(history.isEmpty()) System.out.println("No History to show");
        else{
            for(int i = history.size() - 1; i>=0; i--){
                System.out.println(history.get(i));
            }
            System.out.println();
        }
        showOptions(new Scanner(System.in),history);
    }

    private static void calculate(Scanner in, Stack<String> history) {
        System.out.println("Choose an option :- \n" +
                "1. Add\n" +
                "2. Subtract\n" +
                "3. Multiply\n" +
                "4. Divide\n" +
                "5. Sin\n" +
                "6. Cosine\n" +
                "7. Factorial\n" +
                "8. Root\n" +
                "9. Exponential\n" +
                "10. Log\n" +
                "11. Percentage\n" +
                "12. Back");
        int option = in.nextInt();
        switch (option){
            case 1:
                Operations.add(in,history);
                break;
            case 2:
                Operations.subtract(in,history);
                break;
            case 3:
                Operations.multiply(in,history);
                break;
            case 4:
                Operations.divide(in,history);
                break;
            case 5:
                Operations.sin(in,history);
                break;
            case 6:
                Operations.cosine(in,history);
                break;
            case 7:
                Operations.factorial(in,history);
                break;
            case 8:
                Operations.root(in,history);
                break;
            case 9:
                Operations.exponential(in,history);
                break;
            case 10:
                Operations.log(in,history);
                break;
            case 11:
                Operations.percentage(in,history);
                break;
            case 12:
                System.out.println("Going back to options: ");
                showOptions(in,history);
                break;
            default:
                System.out.println("please choose a valid option");
                calculate(in,history);
        }
        showOptions(in, history);
    }
}
