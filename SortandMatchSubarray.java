🔄 Sort and Match Subarray
You are given two arrays A and B, each of length N.

You are allowed to choose a subarray (i.e., a continuous segment of indices) and sort it in ascending order in both arrays.

Your goal is to make the arrays identical (i.e., A[i] == B[i] for all i) by performing this single sorting operation.

Since both arrays are permutations of each other, it is guaranteed that such an operation is possible.

🧩 Task:
For each test case, find the minimum length of a subarray that you can sort in both arrays to make them equal.

import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int l = 0, r = n - 1;

            while (l < n && a[l] == b[l]) l++;
            while (r >= 0 && a[r] == b[r]) r--;

            if (l > r) {
                System.out.println(0);
                continue;
            }

            int[] subA = Arrays.copyOfRange(a, l, r + 1);
            int[] subB = Arrays.copyOfRange(b, l, r + 1);

            Arrays.sort(subA);
            Arrays.sort(subB);

            boolean isEqual = true;
            for (int i = 0; i < subA.length; i++) {
                if (subA[i] != subB[i]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                System.out.println(r - l + 1);
            } else {
                System.out.println(n); // fallback, worst case
            }
        }
    }
}
