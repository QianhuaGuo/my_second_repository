package com.shop.city.common.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

@Data
public class Student {

    private int id;
    private String name;
    private int score;
    private int studentId;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"张三",80));
        students.add(new Student(1,"张三",80));
        students.add(new Student(1,"张三",79));
        students.add(new Student(2,"李四",60));
        students.add(new Student(3,"王五",30));
        students.add(new Student(3,"王五",70));
        students.add(new Student(3,"王五",70));
        students.add(new Student(4,"赵六",60));
        students.add(new Student(4,"赵六",85));

        //获取某一字段并去重
        List<Integer> students1 = students.stream().map(Student::getId).distinct().collect(Collectors.toList());
        //根据某一字段去重
        List<Student> students2 = students.stream().collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparing(n->n.getId()))),ArrayList::new));
        //获取分数为80的数据
        List<Student> students3 = students.stream().filter(student -> 80 == student.getScore()).collect(Collectors.toList());

//        students1.stream().distinct();
        for (Integer integer : students1){
//            System.out.println(integer);
        }
        for (Student student : students2){
//            System.out.println(student.toString());
        }
        for (Student student : students3){
            System.out.println(student.toString());
        }

        List<String> ss = new ArrayList<>();
        List<String> a = new ArrayList<>();
        ss.add("ss");
        ss.add("sss");
        ss.add("ss");
        a = ss.stream().distinct().collect(Collectors.toList());
        for (String s: a){
            System.out.println("s:"+s);
        }

//        Map<Integer,List<Student>> co = students.stream().collect(Collectors.groupingBy(Student::getId));
//
//        Map<Integer,Integer> ii = students.stream().collect(Collectors.groupingBy(Student::getId,Collectors.summingInt(Student::getScore)));
//
//        //map.keySet().forEach
//        for (Integer key : co.keySet()) {
//            System.out.println("map.get(" + key + ") = " + co.get(key));
//        }
//
//        //map.entrySet().forEach
//        for (Map.Entry<Integer, List<Student>> integerListEntry : co.entrySet()) {
//            System.out.println("map.get(" + integerListEntry + ") = " + co.get(integerListEntry));
//        }
//
//        //map.values().forEach
//        for (List<Student> value : co.values()) {
//            System.out.println("value:" + value);
//        }




    }


}
