/*
    Question: Find such indexes which can return the target value after adding values of those indexes.
    Approach_1 - Brute Force

    TIME COMPLEXITY = O(n^2)
*/

package ArrayList.Questions.Pair_Sum;
import java.util.ArrayList;

public class Pair_Sum1 {
    public static void pair_sum(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                int currSum = list.get(i) + list.get(j);
                if(currSum == target) {
                    System.out.println("First idx :  "  + i + " | Second idx : "  + j + " => " + list.get(i) + " + " + list.get(j) + " = " + target);
                    break;
                }
            }
        }
    }

    //This is sorted ArrayList.
    public static void main(String[] args) {
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        pair_sum(list,target);
    }
}
