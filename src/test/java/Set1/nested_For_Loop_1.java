package Set1;

public class nested_For_Loop_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { // Outer loop
            System.out.println("Outer loop"+i);
            for (int j = 1; j <= 3; j++) { // Inner loop
                System.out.print(i + " "+j+":   ");
            }
            System.out.println();
        }
    }
}
