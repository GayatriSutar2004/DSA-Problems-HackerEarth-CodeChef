# 🛒 Cost of Groceries

**Problem Statement:**  
Chef visited a grocery store to buy fresh supplies. There are `N` items in the store, each with:
- A freshness value `Ai`
- A cost `Bi`

Chef will buy an item **only if its freshness value is greater than or equal to `X`**.

Your task is to compute the **total cost** of all the items Chef buys.

---

## 🔢 Input Format:
- First line: Integer `T` (number of test cases)
- For each test case:
  - First line: Two integers `N` and `X`
  - Second line: Array `A` of `N` integers (freshness values)
  - Third line: Array `B` of `N` integers (costs)

---

## 🖨️ Output Format:
- For each test case, print the total cost of items Chef buys.

---

## 🧪 Sample Input:



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }
            
            int cost=0;
            for (int i = 0; i < n; i++) {
                if(a[i]>=x){
                    cost=cost+b[i];
                }
            }
            System.out.println(cost);
            // Your code goes here
        }
    }
}
