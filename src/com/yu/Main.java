package com.yu;
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person(1);
        Person p2 = new Person(4);
        Person p3 = new Person(2);
        Person p4 = new Person(9);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(list.get(0));
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