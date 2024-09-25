
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String a=sc.next();


        //ENHANCED SWITCH STATEMENT


//        switch (a) {
//            case "Azad"->System.out.println("Head of Khan Family");
//            case "Aslam"-> System.out.println("Second head of khan family");
//            case "Manu"->System.out.println("Elder Daughter of khan Family");
//            case "Sanu"->System.out.println("Khan family daughter studied in marwadi university");
//            default->System.out.println("Not belongs to khans family");
//        }


        //BASIC SWITCH STATEMENT
            switch (a) {
                case "Azad":
                    System.out.println("Head of Khan Family");
                    break;
                case "Aslam":
                    System.out.println("Second head of khan family");
                    break;
                case "Manu":
                    System.out.println("Elder Daughter of khan Family");
                    break;
                case "Sanu":
                    System.out.println("Khan family daughter studied in marwadi university");
                    break;
                default:
                    System.out.println("Not belongs to khans family");
            }

    }
}