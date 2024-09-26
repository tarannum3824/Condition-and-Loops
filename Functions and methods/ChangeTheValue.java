import java.util.*;
public class ChangeTheValue {
    public static void main(String[] args) {
        int [] array={1,3,2,4,3,23};
        change(array);
        System.out.println(Arrays.toString(array));
    }
    static void change(int [] number){
        number[3]=34; //if you change a object by ref variable then same object will be changed
    }
}

//Output should be
//[1, 3, 2, 34, 3, 23] it change the value of 3rd index
