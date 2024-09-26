import java.util.*;
public class ArrayListUsingUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList <Integer> list=new ArrayList<Integer>();
        System.out.println("Enter the element in list:");
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        //printing th element
        System.out.println(list);
        System.out.println(list.get(5));



    }
}
