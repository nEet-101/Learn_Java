/*
Questin: 1 - Solution Type 2 -> Using Pointer Approach (Optimised)
-> Container with most water stored: A rectangular container with multiple line of various heights is given, such that
    by pairing 2 lines we can create a container that can store water.
    So we have to find which container can store max units of water.
    (SOLVED USING 2 POINTER APPROACH)
* */

package ArrayList.Questions.Contiainer_Water;

import java.util.ArrayList;

public class Water_Container2 {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0, rp = height.size()-1; //initialization of left-pointer and right-pointer
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp)); //calculate min height of line
            int wd = rp - lp; //calculate width
            int currWater = ht * wd; //calculate units of water stored
            maxWater = Math.max(maxWater,currWater);
            //increase lp by 1 if height of lp < rp
            if(height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--; // when rp < lp
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(10);
        System.out.println("Max amount of water can be stored : " + storeWater(height) + " units.");
    }
}
