package Que3550;
//3550. Smallest Index With Digit Sum Equal to Index
public class Sol {

     public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sumOfDigits(nums[i]) == i) {
                return i;
            }
        }
        return -1;
    }

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

   
    public static void main(String[] args) {
        Sol obj = new Sol();

        int[] nums1 = {1, 3, 2};
      

        System.out.println(obj.smallestIndex(nums1)); 
       
    }
}