import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

        int a = Arrays.asList(c).indexOf(sc.nextLine());
        int b = Arrays.asList(c).indexOf(sc.nextLine());
        int d = Arrays.asList(c).indexOf(sc.nextLine());

        System.out.println((a * 10L + b) * (long)Math.pow(10, d));
    }
}
