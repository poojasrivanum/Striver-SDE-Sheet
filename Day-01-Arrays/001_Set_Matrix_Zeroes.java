import java.util.*;

class Solution {

    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        // Mark rows and columns
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Set zeroes
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        Solution obj = new Solution();

        obj.setZeroes(matrix);

        // Print matrix
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}