class Kadai05 {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        for(int i=0;i<5;i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int n = a.length;
        for(int i=0;i<n-1;i++) {
            System.out.println(a[i]+" "+a[i+1]);
        } 
    }
}