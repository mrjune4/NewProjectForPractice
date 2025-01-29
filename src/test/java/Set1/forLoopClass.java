package Set1;

public class forLoopClass {
    public static void main(String[] args) {
        int s = 0;
        for (int x = 1; x<=20; x++)
        {
            s= s+x;
        }
        System.out.println("Sum:"+s);
    }
}

//In the above code. we have to declare variable s outside the loop as we are using same after the loop.
//If we had declared the variable s within the loop then we could not used it outside the loop.