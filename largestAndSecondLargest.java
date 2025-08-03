🏃‍♀️🏃 Largest and Second Largest
You are given an array A of N integers.
Your task is to find the maximum sum of two distinct integers in the array.

⚠️ Note: It is guaranteed that there exist at least two distinct integers in the array.

📥 Input Format
The first line contains a single integer T — the number of test cases.

For each test case:

The first line contains a single integer N — the size of the array.

The second line contains N space-separated integers — the elements of the array A.

📤 Output Format
For each test case, print a single integer on a new line — the maximum sum of two distinct integers in the array.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            
            int m1=-1;
            int m2=-1;
            
            for(int i=0;i<n;i++){
                
                if(m1<a[i]){
                    m2=m1;
                    m1=a[i];
                }
                else if(m2<a[i] && m1!=a[i]){
                    m2=a[i];
                    
                }
            }
            System.out.println(m1 + m2);
        }
    }
}
