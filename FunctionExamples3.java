
public class FunctionExamples3 {

    public static void main (String[] argv)
    {
	// The range of n that we're looking at.
	int nLow = 10, nHigh=100, nStep=10;

	for (int n=nLow; n<=nHigh; n+=nStep) {
	    int f = numberOfDivides (n);
	    System.out.println ("n=" + n + "  f=" + f);
	}
    }

    static int numberOfDivides (int n)
    {
        int f = 0;
        while (n > 1) {
            n /= 2;
            f++;
        }
        return f;
    }

}
