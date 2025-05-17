import java.util.*;

public class Q5 {
    public static int Sum(int n, int i, int sum) {
        if (i == n) { // Base case: when i reaches n
            return sum + n; // Add n and return
        }
        return Sum(n, i + 1, sum + i); // Recursive call with i+1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int N = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leak
        
        int k = Sum(N, 0, 0);
        System.out.println(k);
    }
}
