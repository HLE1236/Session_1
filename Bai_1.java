import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n >= 0) System.out.println("Đây là số nguyên dương");
        else System.out.println("Đây là số nguyên âm");
        scanner.close();
    }
}