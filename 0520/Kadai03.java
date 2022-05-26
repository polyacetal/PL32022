class Kadai03 {
    static int calcSum(int[] a) {
        int all = 0;
        int n = a.length;
        for(int i=0;i<n;i++) {
            all += a[i];
        } 
        return all;
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        for(int i=0;i<5;i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int all = calcSum(a);
        System.out.println(all);
    }
}