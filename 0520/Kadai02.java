class Kadai02 {
    static void printArray(int[] a) {
        int n = a.length;
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        } 
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        for(int i=0;i<5;i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        printArray(a);
    }
}