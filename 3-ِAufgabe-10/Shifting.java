public class Shifting{
    public static void main(String[] args) {
        double val1 = 8;
        double val2 = 9;
        double val3 = 2;
        // val1 = 9
        // val2 = 2
        // val3 = 8
        ringShift(val1, val2, val3);
        // shifting using primative data is not going to work becuase it makes copy on assign operator =
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

    }

    public static void ringShift ( double a , double b , double c ) {
        double tempVar = a;
        a = b;
        b = c;
        c = tempVar;
    }
}
