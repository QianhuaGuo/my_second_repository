package com.shop.city.common.jvmtest;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: Watermelon
 * @Date: 2021/3/4 14:33
 */
public class LockSupportTest {

    public static void main(String[] args) {
        LockSupport.parkNanos(5);

        Thread thread = new Thread(new Su());
        LockSupport.unpark(thread);
    }
    static class Su implements Runnable{
        @Override
        public void run() {
            System.out.println("5开始");
        }
    }
}
