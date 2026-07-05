import java.util.Scanner;

public class circum {
    public static void printsum(double c,int r){
        double pi = 3.14;
        //c= circumference of circle
        c = 2*pi*r;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        printsum(r, r);
        sc.close();
        sc.close();
    } 
}