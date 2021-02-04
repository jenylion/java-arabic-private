// das ist die Richtige losung
public class Shifting {
    public static void main(String[] args) {
        MyDouble val1 = new MyDouble(8);
        MyDouble val2 =new MyDouble(9);
        MyDouble val3 = new MyDouble(2);
        // val1 = 9
        // val2 = 2
        // val3 = 8
        ringShift(val1, val2, val3);
        // shifting using primative data is not going to work becuase it makes copy on assign operator =
        System.out.println(val1.data);
        System.out.println(val2.data);
        System.out.println(val3.data);

    }



    public static void ringShift ( MyDouble a , MyDouble b , MyDouble c ){
        double tempVar = a.data;
        a.data = b.data;
        b.data = c.data;
        c.data = tempVar;
    }

    static class MyDouble{
        public double data;
        public MyDouble(double number) {
            this.data = number;
        } 
    }

    
}

