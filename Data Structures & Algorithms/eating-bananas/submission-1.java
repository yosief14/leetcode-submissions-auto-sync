class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = -1;
        int pileCount = 0;

        for (int p : piles) {
            pileCount += p;
            maxPile = Math.max(p, maxPile);
        }

        int l = (int) Math.ceil((double) pileCount / h);
        int r = maxPile;
        int k = r;

        while (l <= r) {
            int hours = 0;
            int m = (l + r) / 2;

            for (int p : piles) {
                hours += Math.ceil((double) p / m);
            }

            if (hours <= h) {
                k = Math.min(k , m);
                r = m -1;
            } else if (hours > h) {
                l = m + 1;
            }
            // prevHours = hours;
        }

        return k;
    }
}

/*

h = hours to eat all bananas
decide our eating rate of k

each hour choose a pile of bananas and  eat k from that pile.

 each iteration is one hour

 if k < [i]
    I must spend another iteration in the same place


return minimum k

If pile has less than k nanas

[1,4,3,2] 9

length= 4

always at least 1 banana

min = length

piles.length<=h

10 total bananas

Brute force

I could find total amount of bananas keeping track of max banas

piles= [1,4,3,2], k=9

10 total
4 max

if k > length
    I can do it in less than the max (4)

else k = max 4



1 and 4




else k = max

math.ciel(10/9) = 1

[5,5,5,5,5] h = 10

18 in 10 hours
5 max num
2 minimum k
math.ciel

how do i know i've found the min


log2 15

2*2*2*2
*/