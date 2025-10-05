package ArrayList.Basics;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(400);
        list.add(1000);
        list.add(35);
        list.add(75);
        list.add(14);
        System.out.println(list);
//        Ascending order
         Collections.sort(list);
//        Descending order
        Collections.sort(list, Collections.reverseOrder()); //Collections.reverseOrder() = comparator in java (defines the logic)
        System.out.println(list); 
    }

}
