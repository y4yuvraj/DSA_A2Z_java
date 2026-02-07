package dataStructures.basics.hashing.implementationChaining;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {
 int bucket;
 ArrayList<LinkedList <Integer>> hashTable;
 MyHash(int bucket)
 {
     this.bucket=bucket;
     this.hashTable=new ArrayList<LinkedList <Integer>>(bucket);

     for(int i=0;i<bucket;i++)
     {
         hashTable.add(new LinkedList<Integer>());
     }
 }

 int hashFunction(Integer num)
 {
     return num%bucket;
 }

 void insert(Integer num)
 {
     int index=hashFunction(num);
     hashTable.get(index).add(num);
 }

 void delete(Integer num)
 {
     int index=hashFunction(num);
     hashTable.get(index).remove(num);
 }

 boolean search(Integer num)
 {
     int index=hashFunction(num);
     return hashTable.get(index).contains(num);
 }

    public static void main(String[] args) {
        MyHash myMap= new MyHash(7);
        myMap.insert(70);
        myMap.insert(71);
        myMap.insert(9);
        myMap.insert(56);
        myMap.insert(72);

        System.out.println(myMap.search(71));
        System.out.println(myMap.search(12));

        myMap.delete(71);
        System.out.println(myMap.search(71));

    }

}
