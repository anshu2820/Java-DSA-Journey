import java.util.Scanner;

public class factorial {
    public static int calculateFac(int n){
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFac(n);
        sc.close();
        sc.close();
    }
}