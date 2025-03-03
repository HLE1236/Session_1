import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String result = s1 + " " + s2;
        System.out.println(result);

        scanner.close();
    }
}