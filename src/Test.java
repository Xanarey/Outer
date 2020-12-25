class Test {
    public static void main(String[] args) {
        int t = 100;
        double[] ar = new double[t];

        for(int i = 0; i < ar.length; i++) {
            ar[i] = Math.random();
        }

        double min = ar[0];
        double max = ar[0];
        double avrg = 0;

        for(int i = 0; i < ar.length; i++) {
            if(min > ar[i]) {
                min = ar[i];
            }
            if(max < ar[i]) {
                max = ar[i];
            }
            avrg += ar[i]/ ar.length;
            System.out.println("ARRAY: " + ar[i]);
        }
        System.out.println();
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
        System.out.println("AVRG : " + avrg);
    }
}