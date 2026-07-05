import java.util.Scanner;

public class prime {
    public static void printprime(int n){
        if(n<=0){
            System.out.println("not prime");
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            System.out.println("not prime");
            break;
            }else{
                System.out.println("number is prime");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printprime(n);
        sc.close();
    }
}