package Q2016;
//2016. Maximum Difference Between Increasing Elements
public class maximumDifference {
    
    public int maxDifference(int[] nums){
        int minNo = nums[0];
        int maxDiff = -1 ;

       for (int i = 0; i < nums.length; i++) {
         if (nums[i] > minNo) {
             int diff = nums[i] - minNo;
             maxDiff = Math.max(maxDiff, diff);
         } else {
            minNo = nums[i] ;
         }
       }
       return maxDiff;
    }
}
