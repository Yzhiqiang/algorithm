package com.yu;
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put("key4", "value4");
        hashMap.put("key5", "value5");

        List<Map.Entry<String, String>> set = hashMap.entrySet();
        for (Map.Entry<String, String> stringStringEntry : set) {

        }
    }
}
class Person implements Comparator<Person> {
    public int age;
    public Person() {}
    public Person(int age) {
        this.age = age;
    }
    public int compare(Person o1, Person o2) {
        if(o1.age > o2.age) return 1;
        else if(o1.age < o2.age) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return ""+this.age;
    }
}