Spiral printing of the matrix



🧩 Edge Cases & Fixes

1️⃣ Empty matrix – avoid crash
👉 Check if (matrix == null || matrix.length == 0)

2️⃣ Single row – don’t re-traverse same row
👉 Use if (top <= bot) before bottom traversal

3️⃣ Single column – don’t re-traverse same column
👉 Use if (left <= right) before left-side traversal

4️⃣ Non-square matrix (e.g., 2×3 or 3×2) – wrong bounds
👉 Initialize correctly:
right = matrix[0].length - 1, bot = matrix.length - 1

5️⃣ Already finished traversal – infinite loop risk
👉 Outer condition: while (top <= bot && left <= right)






-----------------------------------------------------------------
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> out1 = new ArrayList<>();

        if (matrix == null || matrix.length == 0) 
            return out1;

        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bot && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                out1.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bot; i++) {
                out1.add(matrix[i][right]);
            }
            right--;

            if (top <= bot) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    out1.add(matrix[bot][i]);
                }
                bot--;
            }

            if (left <= right) {
                // Traverse from bottom to top
                for (int i = bot; i >= top; i--) {
                    out1.add(matrix[i][left]);
                }
                left++;
            }
        }

        return out1;
    }
}
