package com.shop.city.common.jvmtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: Watermelon
 * @Date: 2021/3/9 15:25
 */
public class CallableTest {

    public static void main(String[] args) {

        CallableTe callableTe = new CallableTe();
        FutureTask futureTask = new FutureTask(callableTe);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());
            System.out.println(futureTask.isDone());
            System.out.println(futureTask.isCancelled());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        String s = "SSS";
        s.intern();
    }

    static class CallableTe implements Callable{

        @Override
        public Object call() throws Exception {
            return 123;
        }
    }
}
