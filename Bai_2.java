import java.util.Scanner;
public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if( a <= 0 || b <= 0 || c <= 0) System.out.println("Khong la ba canh tam giac vuong");
        else{
            if(a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b ){
                System.out.println("La ba canh tam giac vuong");
            }
            else{
                System.out.println("Khong la ba canh tam giac vuong");
            }
        }
        scanner.close();
    }
}