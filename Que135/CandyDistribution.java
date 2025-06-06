import java.util.Arrays;

public class CandyDistribution  {

    public static void main(String[] args) {
        CandyDistribution c = new CandyDistribution();
        int[] ratings = {1,2,1,3};
        System.out.println(c.candy(ratings));
    }

    public int candy(int[] ratings){
        
        int n = ratings.length;
        int[] candies = new int[n]; 
        Arrays.fill(candies ,1);

        for (int i = 1; i < n ; i++) {
            if (ratings[i] > ratings[i-1]) {
                candies[i] = candies[i-1] + 1 ;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                candies[i] = Math.max(candies[i], candies[i+1] + 1 );
            }
        }

        int total = 0 ;
        for (int candy : candies) {
            total += candy ;
        }

        return total;
    }
    
}