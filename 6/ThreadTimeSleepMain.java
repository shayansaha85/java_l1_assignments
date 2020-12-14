package com.assignment6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class ThreadTime extends Thread {
    private String threadName;
    ThreadTime(String name) {
        threadName = name;
        System.out.println("Creating "+threadName);
    }

    static void printDateTime() {
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now)); 
    }
    
    public void run() {
        System.out.println("Running "+threadName);
        try {
            for(int i=0; i<2; i++) {
                printDateTime();
                Thread.sleep(10000);
            }
        }

            catch(InterruptedException e) {
                System.out.println("Thread " +  threadName + " interrupted.");
            }
        }
    }
public class ThreadTimeSleepMain {
    public static void main(String args[]) {
        ThreadTime t1 = new ThreadTime("MyThread");
        t1.start();
    }
}
