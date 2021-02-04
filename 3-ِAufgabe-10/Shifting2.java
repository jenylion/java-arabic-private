public class Shifting{
    public static void main(String[] args) {
        Double val1 = 8.0;
        Double val2 = 9.0;
        Double val3 = 2.0;

        ringShift(val1, val2, val3);
        // shifting using primative data is not going to work becuase it makes copy on assign operator =
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    
}

public static void ringShift ( Double a , Double b , Double c ){
    double tempVar = a;
    a = b;
    b = c;
    c = tempVar;
}

}