import java.util.Scanner;
public class FibbonacciNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int nt=0;
        if(n>=1){
            System.out.println(a);
        }
        if(n>=2){
            System.out.println(b);
        }
        //using dow hile loop
        int i=3;
        do{
            nt=a+b;
            a=b;
            b=nt;
            System.out.println(b);
            i++;
        }while(i<=n);


        //using while loop
//        int i=3;
//        while(i<=n){
//            nt=a+b;
//            System.out.println(nt);
//            a=b;
//            b=nt;
//            i+=1;
//        }
        //using for loop
//        for(int i=3;i<n+1;i++){
//            nt=a+b;
//            System.out.println(nt);
//            a=b;
//            b=nt;
//        }


    }
}
