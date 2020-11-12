package com.shop.city.common.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamTest {

    /**
     * 数据量不大是使用stream串行流销量比并行流parallelStream效率更快
     * 串行流会将流拆分成多个流块计算后在合并计算结果。
     * 串行流使用了forkJoin框架
     * @param args
     */
    public static void main(String[] args) {
        int size = 5000000;

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0;i<size;i++){
            integers.add(random.nextInt(5000000));
        }

        long startTime = System.nanoTime();
        System.out.println("排序开始时间："+startTime);
//        integers.stream().sorted();
        integers.parallelStream().sorted().count();
        long endTime = System.nanoTime();
        System.out.println("排序结束时间："+ endTime );
        long cha = endTime - startTime;
        System.out.println("时间差："+cha);

    }
}
