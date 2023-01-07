// Unit 3, Module 0

public class ArrayExample {

    static int[] A;

    public static void main (String[] argv)
    {
        makeArray ();
        print ();
        
        add (100);
        print ();
    }

    static void makeArray ()
    {
        A = new int [10];
        for (int i=0; i<A.length; i++) {
            A[i] = i * i;
        }
    }

    static void print ()
    {
        for (int i=0; i<A.length; i++) {
            System.out.print (" " + A[i]);
        }
        System.out.println ();
    }

    static void add (int k)
    {
        int[] B = new int [A.length + 1];
        
        for (int i=0; i<A.length; i++) {
            B[i] = A[i];
        }
        B[B.length-1] = k;

        A = new int [B.length];
        for (int i=0; i<A.length; i++) {
            A[i] = B[i];
        }
        
        
    }

}
