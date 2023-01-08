// Unit 3, Module 0

public class ArraySumRecursive {

    public static void main (String[] argv)
    {
        int[] A = makeArray (5);
        int sum = findSumRecursive (A, A.length-1);
        System.out.println (sum);
    }

    static int[] makeArray (int size)
    {
        int[] A = new int [size];
        for (int i=0; i<size; i++) {
            A[i] = 2*i + 1;
        }
        return A;
    }

    static int findSumRecursive (int[] A, int last)
    {
        if (last == 0) {
            return A[0];
        }
        
        int s = A[last] + findSumRecursive (A, last-1);
        
        System.out.println ("s=" + s + " last=" + last);
        
        return s;
    }
}
