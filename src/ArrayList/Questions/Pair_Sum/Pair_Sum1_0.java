/*
QUESTION: If addition of 2 numbers is equal to target value then return true else false.
- Catch: Array is sorted. --> IMP
- Approach: 2 Pointer Approach (Optimised)
Approach:
while (lp < rp)
    case1: lp.value + rp.value == target
            return true
    case2: lp.value + rp.value < target
            lp++; //update lp --> this is because our array is in sorted fashion, so to increase the resultant value shift the lp toward right.
    case3: lp.value + rp.value > target
            rp--; //update rp --> this is because our array is in sorted fashion, so to decrease the resultant value shift the rp toward left.

    TIME COMPLEXITY = O(n) (LINEAR TC) [WHEN lp == rp, the execution of loop is terminated]
*/


package ArrayList.Questions.Pair_Sum;

import java.util.ArrayList;
public class Pair_Sum1_0 {
    public static boolean pair_sum1(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size()-1;
        while (lp < rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                //case 3
                rp--; //when (list.get(lp) + list.get(rp) > target)
            }
        }
        return false;
    }

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
        System.out.println(pair_sum1(list,target));
    }
}
