import java.util.*;
public class MultiDimentionaArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Decleration the multiArraylist
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        //Initializing the multiArraylist
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //Fetching values
        System.out.println("Enter the arrayList items");
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                list.get(a).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
