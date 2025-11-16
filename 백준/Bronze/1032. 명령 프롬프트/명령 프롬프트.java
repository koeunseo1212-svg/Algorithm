import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        int len = arr[0].length();
        StringBuilder result = new StringBuilder();

        for(int pos = 0; pos < len; pos++){
            char c = arr[0].charAt(pos);
            boolean same = true;

            for(int i = 0; i < n; i++){
                if(arr[i].charAt(pos) != c){
                    same = false;
                    break;
                }
            }

            if(same)
                result.append(c);
            else
                result.append('?');
        }
        System.out.println(result.toString());
    }
}
