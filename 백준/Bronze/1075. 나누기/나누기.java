import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int F = sc.nextInt();
        
        int base = (N / 100) * 100;
        int remainder = base % F;

        int result;
        if (remainder == 0) {
            result = 0;
        } else {
            result = F - remainder;
        }

        System.out.printf("%02d", result);
    }
}