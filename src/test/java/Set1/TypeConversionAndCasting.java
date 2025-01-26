package Set1;

public class TypeConversionAndCasting {
    public static void main(String[] args) {
        //Automatic Conversion [Implicit]
        int small_Number = 100;
        System.out.println(small_Number);
        double big_Number = small_Number;
        System.out.println(big_Number);

        //Manual Conversion [Explicit]
        double double_digit = 109.4;
        System.out.println(double_digit);
        int single_Digit = (int) double_digit;
        System.out.println(single_Digit);

        //String number_int = "A"; //In this example the program will fail.
        String number_int = "11"; //In this example the program will work.
        int new_number = Integer.parseInt(number_int);
        System.out.println(new_number);

        char new_char = 'A';
        for (int i = 0; i<26; i++) {
            int char_new = (int) new_char;
            System.out.println("Reference Number For:"+new_char+ "\t"+ char_new);
            new_char++;
        }
        char new_Z_char = 'A';
        int Z_new_char = (int) new_Z_char;
        System.out.println(Z_new_char);
    }
}
