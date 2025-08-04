🔍 Problem Summary
You are given a circular list of tram stations (1 to N), and ticket_cost[i] is the cost to travel from station i+1 to (i+2) (or from N to 1 at the end).

You need to find the minimum cost to go from start to finish, either:

Clockwise

OR anti-clockwise

🧠 How to Solve
1. Convert to 0-based indexing
Since the array is 0-based but stations are 1-based, we adjust:

start--

finish--

2. Handle circular travel
In clockwise, you go from start to finish forward

In anti-clockwise, you go backward from start to finish

We just simulate both and sum the corresponding ticket costs.



import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter wr = new PrintWriter(System.out); // Not used, can remove if you want
         
        int N = Integer.parseInt(br.readLine().trim());
        int start = Integer.parseInt(br.readLine().trim());
        int finish = Integer.parseInt(br.readLine().trim());
        String[] arr_Ticket_cost = br.readLine().split(" ");
        int[] Ticket_cost = new int[N];
        for(int i_Ticket_cost = 0; i_Ticket_cost < arr_Ticket_cost.length; i_Ticket_cost++) {
            Ticket_cost[i_Ticket_cost] = Integer.parseInt(arr_Ticket_cost[i_Ticket_cost]);
        }

        long out_ = solve(N, start, finish, Ticket_cost);
        System.out.println(out_);

        // wr.close();
        br.close();
    }

    static long solve(int N, int start, int finish, int[] Ticket_cost){
        start--;  // convert to zero-based index
        finish--;

        if(start == finish) return 0;

        long clockwiseCost = 0;
        long anticlockwiseCost = 0;

        // Calculate clockwise cost
        for(int i = start; i != finish; i = (i + 1) % N) {
            clockwiseCost += Ticket_cost[i];
        }

        // Calculate anticlockwise cost
        for(int i = start; i != finish; i = (i - 1 + N) % N) {
            anticlockwiseCost += Ticket_cost[(i - 1 + N) % N];
        }

        return Math.min(clockwiseCost, anticlockwiseCost);
    }
}
