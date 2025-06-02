package Que909;

import java.util.LinkedList;
import java.util.Queue;

//909. Snakes and Ladders

public class SnakesAndLadders {

    public static void main(String[] args) {
        
        int[][] board = {
                            {-1, -1, -1, -1, -1, -1},
                            {-1, -1, -1, -1, -1, -1},
                            {-1, -1, -1, -1, -1, -1},
                            {-1, 35, -1, -1, 13, -1},
                            {-1, -1, -1, -1, -1, -1},
                            {-1, 15, -1, -1, -1, -1}
                        };
        SnakesAndLadders sl = new SnakesAndLadders();
        System.out.println(sl.SnakesAndLadders(board));


    }

    public int SnakesAndLadders(int[][] board) {

        int n = board.length;
        boolean[] visited = new boolean[n * n + 1];
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        visited[1] = true;
        int moves = 0;

        while (!que.isEmpty()) {
            int size = que.size();

            for (int i = 0; i < size; i++) {
                int curr = que.poll();

                if (curr == n * n)
                    return moves;

                for (int dice = 1; dice <= 6; dice++) {
                    int next = curr + dice;
                    if (next > n * n)
                        break;

                    int[] pos = getCoordinates(next, n);
                    int row = pos[0], col = pos[1];

                    if (board[row][col] != -1) {
                        next = board[row][col]; // ladder or snake
                    }

                    if (!visited[next]) {
                        visited[next] = true;
                        que.offer(next);
                    }
                }
            }
            moves++;

        }
        return -1;

    }

    private int[] getCoordinates(int num, int n) {
    int r = (num - 1) / n;
    int c = (num - 1) % n;

    int row = n - 1 - r;
    int col = (r % 2 == 0) ? c : (n - 1 - c);

    return new int[] { row, col };
}


}
