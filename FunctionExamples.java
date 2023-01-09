
public class FunctionExamples {

    public static void main (String[] argv)
    {
	// The range of n that we're looking at.
	int nLow = 1, nHigh=10, nStep=1;

	for (int n=nLow; n<=nHigh; n+=nStep) {
	    double f = 2*n;               // f(n) = 2n
	    double g = n*n;               // g(n) = n^2
	    double h = 10*Math.sqrt(n);   // h(n) = 10*sqrt(n)

	    System.out.println ("n=" + n + "  f=" + f + "  g=" + g + "  h=" + h);
	}

    }

}
