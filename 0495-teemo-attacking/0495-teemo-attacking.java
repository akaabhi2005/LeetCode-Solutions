class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;

        for(int i= 1; i<timeSeries.length; i++){
             int gap = timeSeries[i] - timeSeries[i - 1];

             if(gap<duration)
              total += gap;

             else
              total += duration;
        }
          total += duration;
          return total;

    }
}