public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); 

        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[0]) {
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }
}
/*

2passes ?
 [30,38,30,36,35,40,28]
 
 [28] at the end mark i = 0
 [40] 40>28 so pop 28 add 40 mark i = 0
 [40,35] 35<40 so I should add it i = 1
 [40,36]36>35 so I pop it and check next number 40 which is greater so I add 36, 
 [40,36] 30 < 36 so i = 1 and add it
 [40,36,30] 38 so I pop 36 and 30 and add it i = 4
 [40:index,38:index] 

  1,4,1,2,1,0,0
I need to look forward for [future] > [current] 


*/