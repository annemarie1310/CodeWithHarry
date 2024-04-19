package Collection_framework.TypesOfarrayLists;

import java.util.LinkedList;


// linkedList is a array list where all the array elements are linked to each other with a reference .
// so here you can add or delete any element in the list with the help of reference.
public class Linked_Arraylist {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList<>();

        l1.add(55);
        l1.add(85);
        l1.add(75);


        l1.addFirst(5);

        l1.addLast(1);

        for (int i=0;i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
