import java.util.Scanner;

public class TwoStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x%2==1) ? "Alice" : "Bob" );
    }
}