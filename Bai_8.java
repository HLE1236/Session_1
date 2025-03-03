import java.util.Scanner;
public class Bai_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = input.length();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(input.charAt(i) >= 48 && input.charAt(i) <= 57){
                cnt = 1;
            }
        }
        if(cnt  == 1) System.out.println("Có");
        else System.out.println("Không");

        scanner.close();
    }
}