package com.codegile.univ.mihai.week1.day2;

import java.util.Map;

public class MyHashMap<K,V>{

    private Entry<K,V>[] table;
    private int capacity = 4;

    public class Entry<K,V>{
        K key;
        V value;
        Entry<K,V> next;


        public Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public MyHashMap(){
        table = new Entry[capacity];
    }


    public void put(K key, V value){
        if(key == null){
            return;
        }
        //Calculez hash
        int hash = hash(key);
        //Creez o noua intrare
        Entry<K,V> newEntry = new Entry<K,V>(key,value,null);
        System.out.println("Value introduced : '" + newEntry.value + "' "+ " with key : " + newEntry.key);
        if(table[hash] == null){
            table[hash] =  newEntry;
        }else{
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];

            while (current != null){
                if(current.key.equals(key)){
                    if(previous == null){
                        newEntry.next = current.next;
                        table[hash] =  newEntry;
                        return;
                    }else{
                        newEntry.next = current.next;
                        previous.next = newEntry;
                        return;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = newEntry;
        }
    }

    public V get(K key){
        int hash = hash(key);
        if(table[hash] == null){
            return null;
        }else{
            Entry<K,V> temp = table[hash];
            while (temp != null){
                if(temp.key.equals(key)){
                    return temp.value;
                }
                temp = temp.next;
            }
            return null;
        }
    }

    private int hash(K key){
       return Math.abs(key.hashCode()) % capacity;
    }

    public static void main(String args[]) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();

        myHashMap.put(2,"ceva");
        myHashMap.put(1,"altceva");
        myHashMap.put(3,"qwers");

        System.out.println(myHashMap.get(3));
        myHashMap.put(3,"news");
        System.out.println("new value of key=3: " + myHashMap.get(3));
    }
}
