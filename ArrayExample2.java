// Unit 3, Module 0

public class ArrayExample2 {
   
    static int max = 100_000;
    static int last;
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
        A = new int [max];
        last = 9;
        for (int i=0; i<=last; i++) {
            A[i] = i * i;
        }
    }

    static void print ()
    {
        for (int i=0; i<=last; i++) {
            System.out.print (" " + A[i]);
        }
        System.out.println ();
    }

    static void add (int k)
    {        
        if (last < max) {
            last ++;
            A[last] = k;
        }
        else {
            System.out.println ("The array is full; no more elements can be added");
        }
    }

}
