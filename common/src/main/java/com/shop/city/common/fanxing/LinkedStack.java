package com.shop.city.common.fanxing;

/**
 * 这个例子使用了一个末端哨兵(end sentinel)来判断堆栈何时为空。这个末端哨兵实在构建LinkedStack时创建的
 * 。然后每调用一次push()方法，就会创建一个Node<T>对象，并将其链接到前一个Node<T>对象。
 * 每次调用pop()方法时，总是返回top.item,然后丢弃当前top所指向的Node<T>,并将top转移到下一个Node<T>,除非
 * 你已经碰到了末端哨兵，这时就不在移动top了。如果已经到了末端，客户端程序还继续调用pop()方法，它只能得到null
 * 说明堆栈已经空了
 * @param <T>
 */
public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;
        Node(){
            item = null;
            next = null;
        }
        Node(U item,Node<U> next){
            this.item = item;
            this.next = next;
        }
        //是否是最后一个节点
        boolean end(){
            return item == null && next == null;
        }
    }

    //在创建莲表示就创建一个末端哨兵（end sentinel）
    private Node<T> top = new Node<T>();

    public void push(T item){
        top = new Node<T>(item,top);
    }

    public T pop(){
        T result = top.item;
        if (!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> ls = new LinkedStack<>();
        for (String s : "aa bb cc".split(" ")){
            ls.push(s);
        }
        String s;
        while ((s = ls.pop()) != null){
            System.out.println(s);
        }
    }
}
