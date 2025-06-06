
//1298. Maximum Candies You Can Get from Boxes

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class MaxCandiesInBox {
    
     public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n = status.length;
        boolean[] hasKey = new boolean[n];
        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> availableBoxes = new HashSet<>();

        for (int box : initialBoxes) {
            queue.offer(box);
            availableBoxes.add(box);
        }

        int totalCandies = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean progress = false;

            for (int i = 0; i < size; i++) {
                int box = queue.poll();

                if (visited[box]) continue;

                if (status[box] == 1 || hasKey[box]) {
                    visited[box] = true;
                    totalCandies += candies[box];
                    progress = true;

                    // Process keys found in the box
                    for (int key : keys[box]) {
                        hasKey[key] = true;
                        if (availableBoxes.contains(key) && !visited[key]) {
                            queue.offer(key);
                        }
                    }

                    // Process boxes found inside the box
                    for (int newBox : containedBoxes[box]) {
                        availableBoxes.add(newBox);
                        queue.offer(newBox);
                    }

                } else {
                    // If not open and no key, retry later
                    queue.offer(box);
                }
            }

            // If no progress made in current round, exit (no more openable boxes)
            if (!progress) break;
        }

        return totalCandies;
    }
    

    public static void main(String[] args) {
        
      int[] status = {1, 0, 1, 0};
int[] candies = {7, 5, 4, 100};
int[][] keys = { {}, {}, {1}, {} };
int[][] containedBoxes = { {1, 2}, {3}, {}, {} };
int[] initialBoxes = {0};

MaxCandiesInBox sol = new MaxCandiesInBox();
System.out.println(sol.maxCandies(status, candies, keys, containedBoxes, initialBoxes)); // Output: 16


    }
}
