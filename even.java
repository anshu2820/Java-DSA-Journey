import java.util.Scanner;

public class even {
    public static void printeven(int n){
        if(n % 2 == 0){
            System.out.println( "even");
        }else{
            System.out.println("not even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printeven(n);
        sc.close();
        sc.close();
    }
}
