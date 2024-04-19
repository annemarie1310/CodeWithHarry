package Collection_framework.TypesOfarrayLists;

import java.util.ArrayList;

public class Arraylist_demo {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);    // here we add two number at same position then the last added num will be first .
        l1.add(0,1);   //  like here 1 will be stored at 0th index .
        l2.add(15);
        l2.add(65);
        l2.add(25);

        l1.addAll(l2);       // this function will add the l2 arraylist elements to the l1 elements .from the end of l1 elements .
        System.out.println(l1.contains(5));   //  this function will tell that if the entered number is there in the array list or not .
        System.out.println(l1.indexOf(6));  // indexOf will get the position of first integer 6 .
        System.out.println(l1.lastIndexOf(6));  // here in l1 list we have 6 integer 2 times so we have to use last-index of to get the index position of the second number
        //l1.clone();     // this method will make a copy of the l1 arraylist .
        // l1.clear();   // clear() method will clear all the data inside the arraylist .

        l1.set(3,555);   // this function will set the value entered at the index value entered ( it will set 555 to index value 3 ) .
        for (int i=0;i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }



    }
}
