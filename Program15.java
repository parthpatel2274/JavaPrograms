import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter No. of Rows for Triangle :-");
            int n = sc.nextInt();
            int sum = 1;
            System.out.print("\n");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(sum + " ");
                    sum++;
                }
                System.out.print("\n");
            }
        }
    }
}
