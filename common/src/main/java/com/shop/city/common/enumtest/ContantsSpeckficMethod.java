package com.shop.city.common.enumtest;


import java.text.DateFormat;
import java.util.Date;

public enum ContantsSpeckficMethod {

    DATA_TIME{
        String getInfo(){
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH{
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },
    VERSION{
        String getInfo(){
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ContantsSpeckficMethod csm : values()){
            System.out.println(csm.getInfo());
        }
    }
}
