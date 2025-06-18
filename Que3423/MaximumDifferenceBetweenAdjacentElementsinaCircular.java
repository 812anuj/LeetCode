package Que3423;
// 3423. Maximum Difference Between Adjacent Elements in a Circular 
public class MaximumDifferenceBetweenAdjacentElementsinaCircular  {
    
    public static  int MaxDiff(int[] num){
        int n = num.length;
        int maxDiff = 0 ;

        for (int i = 0; i < n; i++) {
            int next = ( i + 1 ) % n ;
            int diff = Math.abs( num[i] - num[next]);
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] num = {1,2,4};
       
        System.out.println ( "Maximum Difference: " + MaxDiff(num));
    }
}
