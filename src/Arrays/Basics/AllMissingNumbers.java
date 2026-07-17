package Arrays.Basics;

import java.util.*;

public class AllMissingNumbers {

    public static List<Integer> findMissing(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        List<Integer> result = new ArrayList<>();

        for(int num:arr){

            set.add(num);

        }

        for(int i=1;i<=arr.length;i++){

            if(!set.contains(i)){

                result.add(i);

            }

        }

        return result;

    }

    public static void main(String[] args){

        int[] arr={4,3,2,7,8,2,3,1};

        System.out.println(findMissing(arr));

    }

}