
public class FunctionPlotExamples {

    public static void main (String[] argv)
    {
	// The range of n that we're looking at.
	int nLow = 10, nHigh=100, nStep=10;

	// We'll put the data in arrays because that's what DrawTool expects:
	double[] x = new double [10];
	double[] f = new double [10];
	double[] g = new double [10];
	double[] h = new double [10];

	double yMax = 0;
	int i = 0;
	for (int n=nLow; n<=nHigh; n+=nStep) {
	    x[i] = n;                   // n goes on the x-axis

	    f[i] = 20*n;                 // f(n) = 2n; changed to 20*n for ex. 0.25
	    g[i] = n*n;                 // g(n) = n^2
	    h[i] = 10*Math.sqrt(n);     // h(n) = 10*sqrt(n)

	    System.out.println ("n=" + n + "  f=" + f[i] + "  g=" + g[i] + "  h=" + h[i]);
	    // We need the maximum to set the graph size in DrawTool.
	    yMax = Math.max(Math.max(f[i],yMax), Math.max(g[i],h[i]));
	    i++;
	}

	// Set up DrawTool.
	DrawTool.setXYRange (nLow,nHigh, 0, yMax);
	DrawTool.display ();

	// Draw the three curves.
	DrawTool.drawCurve (x, f);
	DrawTool.setCurveColor ("red");
	DrawTool.drawCurve (x, g);
	DrawTool.setCurveColor ("green");
	DrawTool.drawCurve (x, h);
    }

}
