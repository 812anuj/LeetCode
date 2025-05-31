package Que2894;
//2894. Divisible and Non-divisible Sums Difference
/*🧠 Problem Understanding
You're given two integers n and m, and you need to:

num1 = sum of numbers from 1 to n not divisible by m

num2 = sum of numbers from 1 to n divisible by m

Return num1 - num2 */
public class DifferenceOfSums {

    public static int differenceOfSums(int n , int m){
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                sum2 += i ;
            }else{
                sum1 += i ;
            }
          
        }
       return sum1 - sum2 ; 
    }



    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3)); // Output: 19
        System.out.println(differenceOfSums(5, 6));  // Output: 15
        System.out.println(differenceOfSums(5, 1));
    }
}