public class Recursive2 {
    public static void main(String[] args) {

        int[] arr = {2,6,8,2,1};
        System.out.println(Recursive2.sum(arr, 0));
        System.out.println(Recursive2.forSum());
        System.out.println(Recursive2.sumRecursiv(1));

        

    }

    public static int sum(int[] x, int i) {
        if (i == x.length){
            return(0);
        } else {
            return(x[i] + Recursive2.sum(x, i + 1));
        }
    }

    public static int forSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumRecursiv(int i) {
        if (i > 100) {
            return (0);
        } else {
            return (i + sumRecursiv(i + 1));
        }
    }
}

// x.length = 5

// i = 0
// i == 5 no
// x[0] = 2 
// return  2 + sum(x, 1)

// i = 1
// i == 5 no
// x[1] = 6
// return 6 + sum(x, 2)

// i = 2 
// i == 5 no
// x[2] = 8
// return 8 + sum(x, 3)

// i = 3 
// i == 5 no
// x[3] = 2
// return 2 + sum(x, 4)

// i = 4 
// i == 5 no
// x[4] = 1
// return 1 + sum(x, 5)

//i = 5
//return 0