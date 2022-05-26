class Kadai05 {
	static int judge(int x){
		int bool = x % 2;
		return(bool);
	}

	public static void main(String[] args) {
		int x;
		x = Integer.parseInt(args[0]);
		int bool = judge(x);
		System.out.println(bool);
	}
}
