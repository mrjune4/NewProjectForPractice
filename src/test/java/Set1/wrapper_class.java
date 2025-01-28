package Set1;

public class wrapper_class {
    public static void main(String[] args) {
        //Example for Autoboxing
        int x = 100;
        Integer y = x;
        System.out.println(y);

        //Example for Unboxing
        int a = 200;
        Integer b = a;
        int c = b.intValue();
        System.out.println("Unboxing Value: "+c);

        //Example for primitive to String
        byte v = 13;
        String w = Byte.toString(v);
        System.out.println("primitive to String Conversion "+w);

        //Example for String to primitive
        byte kk = Byte.parseByte(w);
        System.out.println("String to primitive conversion "+kk);
        //This process will be same for all remaining primitive data types.

        //Example for Object to String
        long l = 1000;
        Long ll = Long.valueOf(l)   ;
        System.out.println("long to Long conversion: "+ll);
        String ss = Long.toString(ll);
        System.out.println("Object to String conversion "+ss);



    }
}
