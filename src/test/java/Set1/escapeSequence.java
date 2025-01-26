package Set1;

public class escapeSequence {
    public static void main(String[] args) {
        //Example for \n
        System.out.println("Welcome to first class of Java. \n This is my first program");
        // Output: Welcome to first class of Java.
        // This is my first program

        //Example for \t
        System.out.println("Welcome to first class of \t Java. \n This is my first \t program");
        //output: Welcome to first class of 	 Java.
        // This is my first 	 program

        //Example for \r
        System.out.println("Welcome to first class of Java.\r This is my first program");
        //Output:  This is my first program

        //Example for \b
        System.out.println("Welcome to first class of Java.\b This is my first program");
        //Output: Welcome to first class of Java This is my first program [. (dot) has been removed]
        System.out.println("Welcome to first class of Java.\b\b\b\b\b This is my first program");
        //Output: Welcome to first class of  This is my first program [Java. has been removed]

        //Example for \f
        System.out.println("Welcome to first class of Java.\f This is my first program");
        //Output: Welcome to first class of Java. This is my first program
        //The \f character may not have a visible effect on most modern consoles, but in some text editors,
        //it acts as a page break.

        //Example for \\
        System.out.println("Welcome to first class of \\Java\\. This is my first \\Program\\");
        //Output: Welcome to first class of \Java\. This is my first \Program\

        //Example for \"
        System.out.println("Welcome to first class of \"Java\". This is my first \"Program\"");
        //Output: Welcome to first class of "Java". This is my first "Program"

        //Example for \'
        System.out.println("Welcome to first class of \'Java\'. This is my first \'Program\'");
        //Output: Welcome to first class of 'Java'. This is my first 'Program'
    }
}
