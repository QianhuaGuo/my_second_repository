package com.shop.city.common.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class Student {

    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"张三",90));
        students.add(new Student(1,"张三",83));
        students.add(new Student(1,"张三",79));
        students.add(new Student(2,"李四",60));
        students.add(new Student(3,"王五",30));
        students.add(new Student(3,"王五",70));
        students.add(new Student(3,"王五",75));
        students.add(new Student(4,"赵六",60));
        students.add(new Student(4,"赵六",85));

        Map<Integer,List<Student>> co = students.stream().collect(Collectors.groupingBy(Student::getId));

        Map<Integer,Integer> ii = students.stream().collect(Collectors.groupingBy(Student::getId,Collectors.summingInt(Student::getScore)));

        //map.keySet().forEach
        for (Integer key : co.keySet()) {
            System.out.println("map.get(" + key + ") = " + co.get(key));
        }

        //map.entrySet().forEach
        for (Map.Entry<Integer, List<Student>> integerListEntry : co.entrySet()) {
            System.out.println("map.get(" + integerListEntry + ") = " + co.get(integerListEntry));
        }

        //map.values().forEach
        for (List<Student> value : co.values()) {
            System.out.println("value:" + value);
        }




    }


}
