package dataStructures.basics.hashing.implementationChaining;

import java.util.ArrayList;
import java.util.LinkedList;

//still needs a lot of improvement

class Entry
{
    Integer key;
    String value;

    Entry(Integer key, String value)
    {
        this.key=key;
        this.value=value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class MyHashMap {
    int bucket;
    ArrayList<LinkedList <Entry>> map;
    MyHashMap(Integer bucket)
    {
        this.bucket=bucket;
        this.map=new ArrayList<>();

        for(int i=0;i<bucket;i++)
        {
            map.add(new LinkedList<>());
        }
    }

    int hashFunction(Integer key)
    {
        return key%bucket;
    }

    void insert(Integer key, String value)
    {
        int index=hashFunction(key);
        map.get(index).add(new Entry(key,value));
    }

    void delete(Integer key)
    {
        int index=hashFunction(key);
        LinkedList<Entry> entries=map.get(index);
        Entry entry = entries.stream()
                .filter(x -> x.getKey().equals(key))
                .findFirst()
                .orElse(null);
        map.get(index).remove(entry);
    }

    boolean search(Integer key)
    {
        int index=hashFunction(key);
        Entry entry = map.get(index).stream()
                .filter(x -> x.getKey().equals(key))
                .findFirst()
                .orElse(null);
        return entry != null;
    }

    public static void main(String[] args) {
        MyHashMap mymap = new MyHashMap(7);

        // insert entries
        mymap.insert(1, "one");
        mymap.insert(8, "eight");
        mymap.insert(15, "fifteen");
        mymap.insert(2, "two");

        // search tests
        System.out.println(mymap.search(1));   // true
        System.out.println(mymap.search(8));   // true
        System.out.println(mymap.search(3));   // false

        // delete test
        mymap.delete(8);

        // search after delete
        System.out.println(mymap.search(8));   // false
        System.out.println(mymap.search(1));   // true
    }
}


