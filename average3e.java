import java.util.Scanner;

public class average3e {
    public static void printaverage(int a,int b,int c,float n){
        //n = average of three numbers
        n = (a+b+c)/3;
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printaverage(a, b, c, c);
    } 
}