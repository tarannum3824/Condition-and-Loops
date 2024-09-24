import java.util.Scanner;
public class Casecheakh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        char ch=sc.nextLine().trim().charAt(5);

        if(ch>='a'&& ch<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("UpperCase");
        }
    }
}
