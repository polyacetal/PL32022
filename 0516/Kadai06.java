class Kadai06 {
	static int judge(int x, int y){
		int bool;
		if(x==y){
			bool = 1;
		}else{
			bool = 0;
		}
		return(bool);
	}

	public static void main(String[] args) {
		int x, y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		int bool = judge(x,y);
		System.out.println(bool);
	}
}
