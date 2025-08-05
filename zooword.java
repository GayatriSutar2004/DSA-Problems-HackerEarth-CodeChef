✅ Problem Breakdown:
You are given a word that:

Starts with some z characters

Ends with some o characters

Contains only 'z' and 'o'

You need to check if the number of os is exactly 2 times the number of zs.
Input:

nginx
Copy
Edit
zzzoooooo
Count of z = 3

Count of o = 6

Since 6 == 2 * 3, the answer is ✅ Yes

import java.util.Scanner;

public class ZooWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int countZ = 0, countO = 0;

        for (char ch : word.toCharArray()) {
            if (ch == 'z') countZ++;
            else if (ch == 'o') countO++;
        }

        if (countO == 2 * countZ)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
