package org.example;

import java.util.ArrayList;
import java.util.List;

public class No202Solution {
    public boolean isHappy(int i) {
        int num = i;
        while (true) {
            num = sumSplits(splits(num));
            if (num < 10) return num == 1;
        }
    }

    private int sumSplits(List<Integer> splits) {
        int sum = 0;
        for (Integer num : splits) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    private List<Integer> splits(int i) {
        int x = i / 10;
        int y = i % 10;
        ArrayList<Integer> splits = new ArrayList<>();
        while (x > 0) {
            splits.add(y);
            y = x % 10;
            x = x / 10;
        }
        splits.add(y);
        return splits;
    }
}
