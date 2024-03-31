import java.util.*;

class adder {
    int add(int a, int b) {
        return (a + b);
    }
}

public class Program16 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :-");
        n1 = sc.nextInt();
        System.out.println("Enter Number 2 :-");
        n2 = sc.nextInt();
        sc.close();

        adder a = new adder();
        System.out.println(a.add(n1, n2));
    }
}