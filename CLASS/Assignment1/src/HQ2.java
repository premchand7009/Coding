package Assignment1;
import java.util.Scanner;

public class HQ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the lines:");
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        System.out.println("Reverse lines are:");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}
