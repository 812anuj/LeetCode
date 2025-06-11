package Q3442 ;
//3442. Maximum Difference Between Even and Odd Frequency I


public class EvenAndOddFrequency {
    public int maxDiff(String s){
        char[] freq = new char[26];

        for (char i : s.toCharArray()) {
            freq[ i - 'a']++ ;
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

          // Process frequencies
        for (int count : freq) {
            if (count > 0) { // Only consider characters that are present
                if (count % 2 == 1) { // odd frequency
                    maxOdd = Math.max(maxOdd, count);
                } else { // even frequency
                    minEven = Math.min(minEven, count);
                }
            }
        }

        // Return the difference
        return maxOdd - minEven;
    }

    public static void main(String[] args) {
        EvenAndOddFrequency sol = new EvenAndOddFrequency();
        System.out.println(sol.maxDiff("aaaaabbc")); // Output: 3
        System.out.println(sol.maxDiff("abcabcab")); // Output: 1
    }
}

    

