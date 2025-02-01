package LoopClass;

import java.util.Scanner;

public class forLoopDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table");
        int a = 0;
        int finalValue = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            System.out.println("You entered a valid integer: " + a);
            for (int x=1; x<=10; x++)
            {
                finalValue = a*x;
                System.out.println("Multiplication of "+a+"*"+x+" : "+finalValue);
            }
        }else {
            System.out.println("Please, enter the valid integer number");
        }


        System.out.println(finalValue);
    }
}
