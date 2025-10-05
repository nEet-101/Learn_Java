package ArrayList.Basics;

import java.util.ArrayList;

public class Swapping {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp;
        temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println("After Swapping (List)  : " + list + " ");
    }

    public static void main(String[] args) {
        int idx1=0, idx2=1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Before Swapping (List) : "+ list + " ");
        swap(list,idx1,idx2);
    }
}
