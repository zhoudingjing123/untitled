package com.company;

public class Main {

/*    public static void main(String[] args) {
        MyThread1 m1=new MyThread1();
        MyThread2 m2=new MyThread2();
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        System.out.println("t1的优先级是"+t1.getPriority());
        System.out.println("t1的优先级是"+t2.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("T1改变后的优先级是"+t1.getPriority());
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("T2改变后的优先级是"+t2.getPriority());

        t1.start();
        t2.start();

    }*/
/*
    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
*/
public static void main(String[] args) {
    Thread t1=new Thread(new MyThread01());
    Thread t2=new Thread(new MyThread02());
   // t1.start();
    t2.start();

}

}
class MyThread01 implements Runnable{
    public void run() {
        for (int i=0;i<10;i++){
            System.out.print("+");
            Thread.yield();
        }
    }
}
class MyThread02 implements Runnable{
    public void run() {
        for (int i=0;i<10;i++){
           // System.out.print("*");
            Thread.yield();
        }
    }
}
