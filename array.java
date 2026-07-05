import java.util.Scanner;

public class array {
   public static void main(String args[]) {
       System.out.println("enter size");
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numbers[] = new int[size];

        System.out.println("enter no:");


       for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
       }


       //print the numbers in array
       for(int i=0; i<numbers.length; i++) {
           System.out.print(numbers[i]+" ");
       }
       sc.close();
       sc.close();
   }
}