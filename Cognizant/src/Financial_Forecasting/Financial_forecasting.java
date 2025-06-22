package Financial_Forecasting;

public class Financial_forecasting {
	public static void main(String[] args) {
		double p = 5000;
		double n = 5;
		double r = 10;
		double forecastedValue = forecastRecursive(p,r,n);
		System.out.println("The forecasted value is "+forecastedValue);
	}
	public static double forecastRecursive(double p, double r, double n)
	{
		if (n==0) return p;
		return forecastRecursive(p,r,n-1)*(1+r);
	}

}
