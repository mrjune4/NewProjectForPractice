package LoopClass;



import java.util.Scanner;

public class forLoopDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.close();

            for (int j = 1; j<=10; j++ )
            {
                System.out.println(num+"*"+j+"="+num*j);
            }

    }
}
