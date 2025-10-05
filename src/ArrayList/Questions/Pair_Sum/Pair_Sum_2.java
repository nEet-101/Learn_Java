/*
QUESTION:
Catch : here arrayList is in sorted and rotated fashion --> [IMP]
        So we have to move lp and rp in rotated manner.
Approach: Using 2 pointer approach.

Solution:
find the pivot point (breaking point)
    breaking point: where list(i) > list(i+1)
    rp = i; lp = i+1
while(lp != rp)
      case1: lp.value + rp.value == target
            return true
      case2: lp.value + rp.value < target --> increase lp but here in rotated manner
            lp = (lp+1) % n [where n = list.size()]
      case3: lp.value + rp.value > target --> decrease rp but here in rotated manner
            rp = (n + rp - 1) % n
*/

package ArrayList.Questions.Pair_Sum;
import java.util.ArrayList;

public class Pair_Sum_2 {
    public static boolean pair_sum2(ArrayList<Integer> list, int target) {
        int bp = -1; //bp = breaking point
        int n = list.size();
        for (int i = 0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1; //left-pointer (index)
        int rp = bp; //right-pointer (index)

        while(lp != rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) < target) {
                //update lp (in rotated fashion)
                lp = (lp+1) % n; //modular arithmetic
            } else {
                //case 3 - update rp (in rotated fashion)
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 100;
        //11 15 6 8 9 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(pair_sum2(list,target));
    }
}
