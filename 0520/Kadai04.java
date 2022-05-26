class Kadai04 {
    static int findMax(int[] a) {
        int max = 0;
        int n = a.length;
        for(int i=0;i<n;i++) {
            if(max < a[i]) max = a[i];
        } 
        return max;
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        for(int i=0;i<5;i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int max = findMax(a);
        System.out.println(max);
    }
}