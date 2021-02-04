
public class main3 {
    public static void main (String[] args) {
        int[] arr = {5, 9, 7, 2, 4, 3};
         
        int[] arr2 = arr;
        arr[0] = 7;

        System.out.println(arr2[0]);


    }
}
