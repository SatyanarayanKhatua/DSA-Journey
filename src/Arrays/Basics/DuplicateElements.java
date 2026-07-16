package Arrays.Basics;

import java.util.HashMap;

public class DuplicateElements {

    public static void findDuplicates(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){

            map.put(num, map.getOrDefault(num,0)+1);

        }

        for(Integer key : map.keySet()){

            if(map.get(key) > 1){

                System.out.println(key);

            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,5,1};

        findDuplicates(arr);

    }

}
