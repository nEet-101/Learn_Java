package ArrayList.Basics;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Boolean> bools = new ArrayList<>();
        ArrayList<Float> list2 = new ArrayList<>();
        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        names.add("Neet");
        names.add("Bhavy");
        names.add("Deep");
        names.add("Kavan");

        //size() function --> returns the size of ArrayList
//        System.out.println("Length of list is "+list.size());
        //Printing array list using for loop.
//        for(int i=0; i<list.size(); i++) {
//            System.out.print(list.get(i) +" ");
//        }
//        System.out.println();



        //get operation
//        System.out.println(list.get(2));
//        System.out.println(names.get(1));
//        System.out.println(names.get(0));

        //remove operation
//        list.remove(3);
//        System.out.println(list);

        //set operation
//        list.set(5,10);
//        list.set(0,20);
//        System.out.println(list);

        //contains operation --> we have .contains() method and it always returns a boolean value (True and False)
//        System.out.println(names.contains("Neet"));
//        System.out.println(names.contains("Bhavya"));

        //QUES 1: Print list in reverse order
//        for (int i=list.size()-1; i>=0; i--) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();



        //QUES 2: Max of ArrayList --> TC = O(n) [Linear Time]
        list.add(100);
        System.out.println(list);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
//            if(list.get(i) > max) {
//                max = list.get(i);
//            }
            max = Math.max(max, list.get(i));

        }
        //Print the max
//        System.out.println("max of list is : "+max);

        //QUES 3: Swap two numbers.
        System.out.print("Before swapping list : "+ list + " ");
        System.out.println();
        int idx1=0, idx2=1, temp;
        //swap
        temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.print("After swapping list : "+ list + " ");
        System.out.println();
    }



}
