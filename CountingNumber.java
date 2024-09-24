import java.util.*;
public class CountingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the digit you want count:");
        int a=sc.nextInt();
        int count=0;
        while(n>0){
            int Q=n%10;
            if(Q==a){
                count +=1;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
