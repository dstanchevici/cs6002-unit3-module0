// Unit 3, Module 0

public class SimpleStructure {

    static int N = 1_000;
    static int[] A = new int [N];
    static int last = -1;

    public static boolean add (int value)
    {
        if (last == N-1) {
            return false;
        }
        
        A[++last] = value;
        return true;
    }

    public static boolean contains (int value)
    {
        for (int v: A) {
            if (v ==  value) {
                return true;
            }
        }
        
        return false;               
    }

    public static void print ()
    {
        for (int i=0; i<=last; i++) {
            System.out.println (A[i]);
        }
    }
}
