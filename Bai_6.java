import java.util.Scanner;
public class Bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0; i < n; i ++) arr[i] = scanner.nextInt();
        for(int i = 0; i < n; i ++) 
        {
            if ( arr[i] > max ) max = arr[i];
        }
        System.err.println(max);
        scanner.close();
    }
}