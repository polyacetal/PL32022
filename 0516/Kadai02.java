class Kadai02 {
	static double calcArea(double x){
		double area = x*x;
		return(area);
	}

	public static void main(String[] args) {
		double x;
		x = Double.parseDouble(args[0]);
		double area = calcArea(x);
		System.out.println(area);
	}
}
