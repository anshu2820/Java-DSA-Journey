import java.util.Scanner;

public class sumodd {
    public static void printsum(int n){
        int sum = 0;
        for(int i=1;i<=n;i=i+2){
            sum = sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printsum(n);
        sc.close();
        sc.close();
    } 
}