class Kadai03 {
	static double calcArea(double x, double y){
		double area = x*y/2.0;
		return(area);
	}

	public static void main(String[] args) {
		double x,y;
		x = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
		double area = calcArea(x,y);
		System.out.println(area);
	}
}
