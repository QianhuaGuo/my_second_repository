package com.shop.city.common.jvmtest;

import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: Watermelon
 * @Date: 2021/3/2 14:03
 */
public class VolatileTest {

//    private static volatile int race = 0;
    private static volatile AtomicInteger race = new AtomicInteger(0);

    private static ThreadLocal<String> stt = new ThreadLocal<>();

    private static final String AAA = "jjj";

    private Map<String,String> map = new ConcurrentHashMap<>();
    private ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1000);

    private ExecutorService pools = Executors.newFixedThreadPool(10);
    private ExecutorService spools = Executors.newCachedThreadPool();
    private ExecutorService apools = Executors.newSingleThreadExecutor();
    private ExecutorService epools = Executors.newScheduledThreadPool(10);

//    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10);

    private static void increase(ThreadLocal<String> stt){
//        race++;
        race.incrementAndGet();
        System.out.println(stt.get());
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        reentrantReadWriteLock.writeLock();
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0;i<THREADS_COUNT;i++){
            stt.set("ABC");
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0;i<10;i++){
                        increase(stt);
                    }
                }
            });

            threads[i].start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(race);
    }





}
