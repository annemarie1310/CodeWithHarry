package Collection_framework;

import java.util.HashSet;

public class HashSet_demo {
    public static void main(String[] args) {

        HashSet <Integer> MyHashSet = new HashSet<>();
        MyHashSet.add(10);
        MyHashSet.add(40);
        MyHashSet.add(50);
        MyHashSet.add(50);  // here we have 2 same values as 50 . but hasSet will take only 1 . duplicate values are not allowed.

        System.out.println(MyHashSet);
        System.out.println(MyHashSet.size()); // will return size of HashSet
        
    }
}
