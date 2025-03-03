import java.util.Scanner;
public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double avg = 0;
        for(int i = 0; i < n; i ++) arr[i] = scanner.nextDouble();
        for(int i = 0; i < n; i ++) avg += arr[i];
        avg = avg / n;
        System.err.println(avg);
        scanner.close();
    }
}