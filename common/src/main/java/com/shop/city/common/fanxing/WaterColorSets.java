package com.shop.city.common.fanxing;

import java.io.PrintStream;
import java.util.EnumSet;
import java.util.Set;

import static com.shop.city.common.fanxing.Sets.*;
import static com.shop.city.common.fanxing.WaterColors.*;

public class WaterColorSets {
    public static void main(String[] args) {
        Set<WaterColors> set1 = EnumSet.range(A,H);
        Set<WaterColors> set2 = EnumSet.range(D,M);
        System.out.println("set1:"+set1);
        System.out.println("set2:"+set2);

        Set<WaterColors> union = union(set1, set2);
        System.out.println("union:"+union);

        Set<WaterColors> subset = intersection(set1,set2);
        System.out.println("intersection:"+subset);

        Set<WaterColors> d1 = difference(intersection(set1,set2),subset);
        System.out.println("d1:"+d1);

        System.out.println("difference(set2,subset):"+difference(set2,subset));
        System.out.println("complement(set1,set2):"+complement(set1,set2));
    }
}
