Alice and Bob run for N days. On each day:
Alice is unhappy if Bob runs more than twice her distance.
Bob is unhappy if Alice runs more than twice his distance.
You need to count the number of days where both are happy (i.e., neither ran more than twice the other).
You’re given multiple test cases. For each one, output how many such happy days there are.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            int h = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] * 2 >= b[i] && b[i] * 2 >= a[i]) {
                    h++;
                }
            }

            System.out.println(h);
        }
    }
}
