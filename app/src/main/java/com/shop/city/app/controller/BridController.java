package com.shop.city.app.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.shop.city.app.bean.Goose;
import com.shop.city.app.service.Brid;
public class BridController {



    public static void main(String[] args) {

        Goose g1 = new Goose();
        Goose g2 = new Goose();
        Goose.i++;
        System.out.println(g1.i);
        System.out.println(g2.i);

        System.getProperties().list(System.out);

        int x=1,y=2,z=3;
        int b = (y-2)/(2+z);
        System.out.println(b);
        System.out.println(g1==g2);
        g1.equals(g2);
        System.out.println(1>>4);


        String c = "ca";
        switch (c){
            case "hh" :
                System.out.println("hh");
                break;
            case "ca" :
                System.out.println("ca");
                break;
            default:
                System.out.println("wanle");
        }

    }
}
