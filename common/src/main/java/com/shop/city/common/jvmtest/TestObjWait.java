package com.shop.city.common.jvmtest;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: Watermelon
 * @Date: 2021/3/4 14:46
 */
public class TestObjWait {
    public static void main(String[] args) throws Exception{
        final Object obj = new Object();
        Thread threadA = new Thread(new Runnable() {
            int sum = 0;
            @Override
            public void run() {
                for (int i = 0;i<10;i++){
                    sum+=i;
                }
//                try{
////                    synchronized (obj){
////                        obj.wait();
////                    }
////                }catch (Exception e){
////                    e.printStackTrace();
////                }
                LockSupport.park();
                System.out.println(Thread.currentThread().getName()+"  sum="+sum);
            }
        },"ThreadA");

        threadA.start();

        //睡眠一秒保证线程A已经计算完成，阻塞在wait方法
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" sleep over");
//        synchronized (obj){
//            obj.notify();
//        }
        LockSupport.unpark(threadA);
        System.out.println(Thread.currentThread().getName()+" over");

    }
}
