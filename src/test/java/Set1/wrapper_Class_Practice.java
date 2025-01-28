package Set1;

import java.sql.SQLOutput;

public class wrapper_Class_Practice {
    public static void main(String[] args) {
        int a = 100;
        Integer b = a;
        long c = b.intValue();
        System.out.println(c);

        byte d = 10;
        String e = Byte.toString(d);
        System.out.println(e);

        byte f = Byte.parseByte(e);
        System.out.println("String to primitive "+f);

        
    }
}
