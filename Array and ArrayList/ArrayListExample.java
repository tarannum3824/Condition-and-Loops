//import java.util.ArrayList;
//public class ArrayList {
//    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<Integer>();
//    }
//}

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Print the list
        System.out.println("ArrayList: " + list);

        //update the list using set method
        list.set(2,59);
        System.out.println(list);


        //removing item
        list.remove(2);
        System.out.println(list);
//
//        System.out.println(list.contains(30));
    }
}
