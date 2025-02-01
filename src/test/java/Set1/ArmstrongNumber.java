package Set1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length(); // Number of digits

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n); // Raise digit to power n and add
            num /= 10;
        }
        return sum == originalNum;
        }

}


