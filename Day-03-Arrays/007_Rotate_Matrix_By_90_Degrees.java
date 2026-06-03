/*
Leetcode 48 - Rotate Image

Approach:
1. Transpose the matrix.
2. Reverse every row.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Transpose matrix
        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for(int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while(left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}