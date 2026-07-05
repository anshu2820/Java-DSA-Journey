import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        System.out.println("size:");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++){
           numbers[i] = sc.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
        sc.close();
    }
}

