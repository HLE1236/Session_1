import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i = i + 2) sum += i;
        System.out.println(sum);
        scanner.close();
    }
}