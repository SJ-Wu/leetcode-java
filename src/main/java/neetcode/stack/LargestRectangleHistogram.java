package neetcode.stack;

import java.util.Stack;

public class LargestRectangleHistogram {

    private record Histogram(int index, int height) {
    }

    public int largestRectangleArea(int[] heights) {
        var maxArea = 0;
        var stack = new Stack<Histogram>();
        for (int i = 0; i < heights.length; i++) {
            var start = i;
            while (!stack.empty() && stack.peek().height() > heights[i]) {
                var pop = stack.pop();
                maxArea = Math.max(maxArea, pop.height() * (i - pop.index()));
                start = pop.index();
            }
            stack.add(new Histogram(start, heights[i]));
        }
        for (Histogram histogram : stack) {
            maxArea = Math.max(maxArea, histogram.height() * (heights.length - histogram.index()));
        }
        return maxArea;
    }

}

