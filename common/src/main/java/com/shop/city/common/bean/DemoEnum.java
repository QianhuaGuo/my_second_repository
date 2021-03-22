package com.shop.city.common.bean;

import lombok.Data;

@Data
public class DemoEnum {

    private String name;

    private String phone;

    private DemoEnum.SexStatus status;

    public DemoEnum(String name, String phone, SexStatus status) {
        this.name = name;
        this.phone = phone;
        this.status = status;
    }


    private static enum SexStatus{
        MEN,
        WOMEN;

        private SexStatus(){
        }

        public static String getString(DemoEnum.SexStatus status){
            return status.toString();
        }
    }

    public static void main(String[] args) {
        DemoEnum d = new DemoEnum("花花","13987978888",DemoEnum.SexStatus.MEN);
        System.out.println(d.toString());
        String sex = DemoEnum.SexStatus.getString(d.getStatus());
        System.out.println("sex:"+sex);
    }
}
