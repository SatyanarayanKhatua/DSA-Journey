package Arrays.Basics;

public class ReverseSubArray {

    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        reverse(arr,2,4);

        for(int num : arr){

            System.out.print(num+" ");

        }

    }

}
