import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            // Read array elements
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Find the minimum value in the array
            int min = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }

            // Count how many elements are greater than min
            int operations = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > min) {
                    operations++;
                }
            }

            // Output the number of operations
            System.out.println(operations);
        }

        scanner.close();
    }
}




🔄 MIN To MAX
Problem Statement:
You're given an array A of size N.
Let M be the minimum value in the array.
In one operation, you can choose any element A[i] and assign it a value X such that 1 ≤ X ≤ 100.

Your goal is to make M the maximum value in the array — that is, make all elements less than M become equal to M.

Find the minimum number of operations required.

🔢 Input Format:
First line: Single integer T — number of test cases.

For each test case:

First line: Integer N — number of elements in the array.

Second line: N space-separated integers A1, A2, ..., AN — the elements of the array.

🖨️ Output Format:
For each test case, print a single line containing the minimum number of operations required.

📚 Constraints:
1 ≤ T ≤ 100

1 ≤ N ≤ 100

1 ≤ Ai ≤ 100


