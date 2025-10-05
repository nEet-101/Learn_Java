/*
* Questin: 1 - Solution Type 1
-> Container with most water stored: A rectangular container with multiple line of various heights is given, such that
    by pairing 2 lines we can create a container that can store water.
    So we have to find which container can store max units of water.
    (SOLVED USING BRUTE FORCE APPROACH)

-> Time Complexity = O(n^2)
*/

package ArrayList.Questions.Contiainer_Water;
import java.util.ArrayList;

public class Water_Container1 {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j)); //calculate height of minimum line
                int wd =  j - i; //calculate width
                int currWater = ht * wd; //calculate units of water stored
                maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }


    public static void main(String[] args) {
//      creating a list that stores lines of various heights
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Maximum units of water stored : " + storeWater(height)+ " units.");
    }
}
