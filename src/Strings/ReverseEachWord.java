package Strings;

public class ReverseEachWord {

    public static String reverseWord(String word) {

        char[] arr = word.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result.append(reverseWord(word)).append(" ");

        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String sentence = "I Love Java";

        System.out.println(reverseEachWord(sentence));

    }
}
