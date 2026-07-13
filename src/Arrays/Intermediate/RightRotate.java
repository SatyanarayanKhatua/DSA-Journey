package Arrays.Intermediate;

public class RightRotate {

    public static void rightRotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        for (int i = 0; i < k; i++) {

            int last = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {

                arr[j] = arr[j - 1];

            }

            arr[0] = last;

        }

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        rightRotate(arr,3);

        for(int num : arr){

            System.out.print(num+" ");

        }

    }

}
