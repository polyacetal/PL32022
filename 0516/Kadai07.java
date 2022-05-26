class Kadai07 {
	static int judge(int x){
		int bool;
		if(0<=x){
			if(x<=10){
				bool = 1;
			}else{
			bool = 0;
			}
		}else{
			bool = 0;
		}
		return(bool);
	}

	public static void main(String[] args) {
		int x;
		x = Integer.parseInt(args[0]);
		int bool = judge(x);
		System.out.println(bool);
	}
}
