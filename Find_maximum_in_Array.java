//Find maximum in an Array

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt(); // Number of mountains
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int largest = a[0];
            for (int i = 1; i < n; i++) {
                if (largest < a[i]) {
                    largest = a[i];
                }
            }

            System.out.println(largest); // Print result for this test case
        }
    }
}
