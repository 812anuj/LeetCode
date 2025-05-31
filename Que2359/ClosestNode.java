package Que2359;
import java.util.Arrays;

//2359. Find Closest Node to Given Two Nodes

public class ClosestNode {
    
    private int[] getDistance( int[] edge , int start){
        int n =edge.length;

        int[] dist = new int[n]; 
        Arrays.fill(dist ,-1); 

        int step = 0;
        int current = start;

        while (current != -1 && dist[current] == -1) {
            dist[current] = step;
            step++;
            current = edge[current];
        }
        return dist ;
    }

    public int closestMeetingNode(int[] edge, int node1 , int node2){
        int n =edge.length;
        int[] dist1 = getDistance(edge, node1);
        int[] dist2 = getDistance(edge, node2);
    
        int minDistance = Integer.MAX_VALUE ;
        int ans = -1 ;
        
        for (int i = 0; i < n; i++) {
            if (dist1[i] == -1 || dist2[i] == -1) {
                continue  ;
            }
            int maxDistance = Math.max(dist1[i], dist2[i]);

            if (maxDistance < minDistance) {
                minDistance = maxDistance;
                ans = i ;
            }
        }
        return ans ;
    }



}
