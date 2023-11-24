package neetcode.arrays_hashing;

import java.util.*;

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer>[] frequent = new ArrayList[nums.length + 1];
        Arrays.setAll(frequent, i -> new ArrayList<Integer>());
        Arrays.stream(nums).forEach(num -> counts.put(num, 1 + counts.getOrDefault(num, 0)));
        counts.keySet().forEach(key -> frequent[counts.get(key)].add(key));
        var result = new int[k];
        var idx = 0;
        for (var i = frequent.length - 1; i >= 0; i--) {
            for (var num : frequent[i]) {
                result[idx++] = num;
                if (idx == k) {
                    return result;
                }
            }
        }
        return result;
    }
}
