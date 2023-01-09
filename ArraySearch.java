
public class ArraySearch {

    public static void main (String[] argv)
    {
	// First make a large array.
	//int N = 1_000;
	//int N = 10_000;
	//int N = 100_000;
        int N = 20;

	int[] A = new int [N];
	for (int i=0; i<N; i++) {
	    A[i] = i;
	}

	int k = IOTool.readIntFromTerminal ("Enter an integer: ");

	// First, a straightforward search.
	long startTime = System.currentTimeMillis ();
	boolean found = plainSearch (A, k);
	long endTime = System.currentTimeMillis ();
	System.out.println ("Found=" + found + "  Time taken: " + (endTime-startTime));

	// Now for a more interesting type of search.
	startTime = System.currentTimeMillis ();
	boolean found2 = fasterSearch (A, k);
	endTime = System.currentTimeMillis ();
	System.out.println ("Found2=" + found2 + "  Time taken: " + (endTime-startTime));
    }

    static boolean plainSearch (int[] A, int value)
    {
        // Walk through the array and look for "value"
	for (int i=0; i<A.length; i++) {
	    if (A[i] == value) {
		return true;
	    }
	}
	return false;
    }

    static boolean fasterSearch (int[] A, int value)
    {
	// Try to puzzle over what this is doing.
        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            System.out.println ("start=" + start + " end=" + end);
            int mid = (start + end) / 2;
            System.out.println ("mid=" + mid);
            if (value == A[mid]) {
                return true;
            }
            else if (value < A[mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            
        }
        return false;
    }

}
