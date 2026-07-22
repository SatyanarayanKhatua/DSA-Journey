package Strings.Basics;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("MADAM"));

    }

    public static class ReverseEachWord {

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
}
