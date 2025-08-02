## 🛍️ Take Discount or Not

This folder contains the solution to the CodeChef problem **"Take Discount or Not"**.

### 📄 Problem Description:
Chef wants to buy all `N` items from a shop. A coupon costing `X` rupees reduces the price of each item by `Y` rupees (or makes it free if the price is ≤ Y).  
Chef will buy the coupon **only if** the **total cost with the coupon** is **strictly less** than the original cost.

### 🧮 Input:
- T test cases
- For each test case:
  - N, X, Y (items, coupon cost, discount per item)
  - N space-separated integers representing item prices

### 🎯 Output:
Print `COUPON` if buying the coupon is beneficial, otherwise `NO COUPON`.

### ✅ Sample Output:
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
