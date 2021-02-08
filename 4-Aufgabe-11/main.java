public class Recursive1 {
    public static void main(String[] args) {

        int[] arr = {2,6,8,2,1};

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i]; // sum = sum + arr[i];
        // }

        // System.out.println(sum);
        int result = Recursive1.sum(arr);
        System.out.println(result);

    }

    public static int sum(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i]; // sum = sum + arr[i];
        }

        return(sum);
        //System.out.println(sum);
    }
}
// sum = 0

// loop 1
// i = 0
// sum = 0 + arr[0] = 0 + 2 = 2

// loop 2
// i = 1
// sum = 2 + arr[1] = 2 + 6 = 8

// loop 3
// i = 2
// sum = 8 + arr[2] = 8 + 8 = 16

