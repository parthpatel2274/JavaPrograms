import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter No. of Rows for the Triangle :-");
            int n = sc.nextInt();
            System.out.print("\n");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
