import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number to Print it's Multiplication Table :-");
            num = sc.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", num, i, num * i));
        }
    }
}