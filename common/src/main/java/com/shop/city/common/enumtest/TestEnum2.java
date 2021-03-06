package com.shop.city.common.enumtest;

import com.shop.city.common.mybatis.IntEnum;

public enum TestEnum2 implements IntEnum {
    AAA(1),
    BBB(2),
    CCC(3);

    private int value;

    TestEnum2(int value){this.value = value;}

    public static TestEnum2 valueOf(int value){
        for (TestEnum2 t2 : TestEnum2.values()){
            if (t2.value == value){
                return t2;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        for (TestEnum2 t2 : TestEnum2.values()){
//            System.out.println(t2.toString().getClass());
//            System.out.println(t2.value);
        }
        TestEnum2 testEnum2 = TestEnum2.valueOf(1);
        System.out.println(testEnum2.getIntValue());
        System.out.println(testEnum2);
    }

    @Override
    public int getIntValue() {
        return value;
    }
}
