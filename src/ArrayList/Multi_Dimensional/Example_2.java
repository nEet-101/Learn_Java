/*
* QUES: Print the following lists inside mainList.
* list1: 1 2 3 4 5
* list2: 2 4 6 8 10
* list3: 3 6 9 12 15
* */

package ArrayList.Multi_Dimensional;
import java.util.ArrayList;

public class Example_2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>  mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

//        Add elements to the lists
        for(int i=1; i<=5; i++) {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

//        Add lists to mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);


//        Printing using loop
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
//        Directly printing mainList
        System.out.print(mainList);
    }


}
