import java.util.Scanner;

public class positive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int positivecount = 0;
        int negativecount = 0;
        int zeroescount = 0;

        for(int i=1;i<=5;i++){
        System.out.println("enter a number:");
        int n = sc.nextInt();

            if(n>0){
                positivecount++;
            }
            else if(n<0){
                negativecount = negativecount +1;
            }else{
                zeroescount = zeroescount +1;
            }
        
        } 
        System.out.println("positive no. is"+ positivecount);
        System.out.println("negative no. is"+ negativecount);
        System.out.println(zeroescount);
    }
}