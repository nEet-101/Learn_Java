package ArrayList.Multi_Dimensional;
import java.util.ArrayList;

public class Example_1 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); //main-list
        ArrayList<Integer> list1 = new ArrayList<>(); //inner-list
        list1.add(1);
        list1.add(2);
        //add list1 in main-list
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        //add list2 in main-list
        mainList.add(list2);

        //print the lists of main-list
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.print(mainList);
    }
}
