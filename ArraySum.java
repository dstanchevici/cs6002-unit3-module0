// Unit 3, Module 0

public class ArraySum {

    public static void main (String[] argv)
    {
        int[] A = makeArray (5);
        int sum = findSum (A);
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

    static int findSum (int[] A)
    {
        int sum = 0;
        for (int v: A) {
            sum += v;
        }
        return sum;
    }
}
