class Solution {
    public int maxArea(int[] heights) {
       int minHeight, res = 0, area; 
       int lft = 0;
       int rt = heights.length -1;

       while (lft<rt){
        area = Math.min(heights[lft], heights[rt]) * (rt - lft);
        res = Math.max(res, area);
        if(heights[lft] <= heights[rt]){
            lft++;
        } else{
            rt --;
        }
       }
        
        return res;
    }
}
/*
I need to find the biggest square I can make out of the lines given in an array 

[1,9,2,5,4,9,3,6]

the value gives me the height
the delta between the 2 lines gives me the width

Area = heights[i] or heights[j] * |i-j|

I know the maximum width I can gain by checking the next index is one (doubling the area)
height is variable



Brute Force
Calculate the area of all combinations while keeping track of the largest one 
Time: O(n^2)
Space: O(1)

Better?
by using pointers I can do this in linear time

I cannot sort 

How do i check?
Limitations are the height of the smallest of the 2 
then the width

start at L:0 and R:1 then check if the next is larger then the left one if it is set P1 to  

When should I swap?

|                    |

I know 
the height matters more 

2 pointers on either end

I need to calculate all of the possible areas keeping track of max

           | 
*/
