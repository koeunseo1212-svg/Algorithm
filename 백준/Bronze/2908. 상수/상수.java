import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        int remainder=0;
        int result1=0;
        int result2=0;
        
        while(num1>0){
            remainder=num1%10;
            result1=result1*10+remainder;
            num1/=10;
        }
        while(num2>0){
            remainder=num2%10;
            result2=result2*10+remainder;
            num2/=10;
        }
        
        if(result1>=result2){
            System.out.println(result1);
        }else{
            System.out.println(result2);
        }
        
        sc.close();
    }
}