class Kadai04 {
	static double calcAverage(int a, int b, int c, int d, int e){
		double average = (a+b+c+d+e)/5.0;
		return(average);
	}

	public static void main(String[] args) {
		int a,b,c,d,e;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		d = Integer.parseInt(args[3]);
		e = Integer.parseInt(args[4]);
		double average = calcAverage(a,b,c,d,e);
		System.out.println(average);
	}
}
