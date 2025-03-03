import java.util.Scanner;
public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        for(int i = 0; i <= n; i = i+2) System.out.println(i);
        scanner.close();
    }
}