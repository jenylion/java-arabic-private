public class ArrayTiming{

    public static void main(String[] args) {
        
        
        System.out.println("doublifyClone");
        System.out.println("n\tTime");
        for(int versuch = 10; versuch <= 10000000; versuch = versuch * 10) {
            double[] x;
            x = new double[versuch];
            fillWithRandomValues(x);
            long zeitSum = 0;
            for(int durch = 0; durch < 100; durch++){
                long startZeit = System.currentTimeMillis();
                doublifyClone(x);
                long fertigZeit = System.currentTimeMillis();
                zeitSum += fertigZeit - startZeit;
            }
            System.out.println(String.format( "%-8s %-4sms", versuch, (double)zeitSum / 100 ) );
        }

        System.out.println("doublifyArrayCopy");
        System.out.println("n\tTime");
        for(int versuch = 10; versuch <= 10000000; versuch = versuch * 10) {
            double[] x;
            x = new double[versuch];
            fillWithRandomValues(x);
            long zeitSum = 0;
            for(int durch = 0; durch < 100; durch++){
                long startZeit = System.currentTimeMillis();
                 doublifyArrayCopy(x);
                long fertigZeit = System.currentTimeMillis();
                zeitSum += fertigZeit - startZeit;
            }
            System.out.println(String.format( "%-8s %-4sms", versuch, (double)zeitSum / 100 ) );
        }

        System.out.println("doublifyCopyOf");
        System.out.println("n\tTime");
        for(int versuch = 10; versuch <= 10000000; versuch = versuch * 10) {
            double[] x;
            x = new double[versuch];
            fillWithRandomValues(x);
            long zeitSum = 0;
            for(int durch = 0; durch < 100; durch++){
                long startZeit = System.currentTimeMillis();
                 doublifyCopyOf(x);
                long fertigZeit = System.currentTimeMillis();
                zeitSum += fertigZeit - startZeit;
            }
            System.out.println(String.format( "%-8s %-4sms", versuch, (double)zeitSum / 100 ) );
        }

        System.out.println("doublify");
        System.out.println("n\tTime");
        for(int versuch = 10; versuch <= 10000000; versuch = versuch * 10) {
            double[] x;
            x = new double[versuch];
            fillWithRandomValues(x);
            long zeitSum = 0;
            for(int durch = 0; durch < 100; durch++){
                long startZeit = System.currentTimeMillis();
                 doublify(x);
                long fertigZeit = System.currentTimeMillis();
                zeitSum += fertigZeit - startZeit;
            }
             ;
            System.out.println(String.format( "%-8s %-4sms", versuch, (double)zeitSum / 100 ) );
        }
        
    }


    public static void fillWithRandomValues ( double [] x ){
        for(int i = 0; i < x.length; i++) {
            x[i] = Math.random();
        }
    }

    public static void doublify ( double [] x ){
        
        
        for(int i = 0; i < x.length; i++) {
            x[i] = 2 * x[i];
        }
    }

    public static double [] doublifyClone ( double [] x ){
 
        // important
        double[] copiedArray = x.clone();

        for(int i = 0; i < copiedArray.length; i++) {
            copiedArray[i] = 2 * copiedArray[i];
        }

        return(copiedArray);
    }
    public static double [] doublifyArrayCopy ( double [] x ) {

        // important
        double[] copiedArray = new double[x.length];
        System.arraycopy(x, 0, copiedArray, 0, x.length);

        for(int i = 0; i < copiedArray.length; i++) {
            copiedArray[i] = 2 * copiedArray[i];
        }
        return(copiedArray);
    }

    public static double [] doublifyCopyOf ( double [] x ){
        double[] copiedArray = java.util.Arrays.copyOf(x, x.length);
        for(int i = 0; i < copiedArray.length; i++) {
            copiedArray[i] = 2 * copiedArray[i];
        }
        return(copiedArray);
    }




}