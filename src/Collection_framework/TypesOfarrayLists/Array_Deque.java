package Collection_framework.TypesOfarrayLists;

import java.util.ArrayDeque;


// ArrayDeque is a type of array where you can do insertion or deletion from end(tail) as well as from start (head) .



public class Array_Deque {

    public static void main(String[] args) {

        ArrayDeque<Integer> ad1= new ArrayDeque<>();
        ad1.add(55);
        ad1.add(66);

        ad1.addFirst(89);  // this function will add the value to the first index position .
        ad1.addLast(77);   // this function will add the value to the last index position .


        System.out.println(ad1.getFirst());  // this function will get the first element in the array.
        System.out.println(ad1.getLast());  // this function will get the last element in the array.
    }


}
