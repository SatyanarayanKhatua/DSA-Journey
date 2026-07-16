package Arrays.Basics;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public static void countFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,1,4,2};

        countFrequency(arr);

    }
}
