import java.util.*;

public class Program03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;
            System.out.println("Enter 1st No. :- ");
            a = sc.nextInt();
            System.out.println("Enter 2nd No. :- ");
            b = sc.nextInt();
            System.out.println("Enter 3rd No. :- ");
            c = sc.nextInt();

            if (a > b) {
                if (a > c) {
                    System.out.println("\n" + a + " Is Greatest.");
                } else {
                    System.out.println("\n" + c + " Is Greatest.");
                }
            } else {
                if (b > c) {
                    System.out.println("\n" + b + " Is Greatest.");
                } else {
                    System.out.println("\n" + c + " Is Greatest.");
                }
            }
        }
    }
}