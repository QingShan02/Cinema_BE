package com.example.demo.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadXC extends Thread{
    @Override
    public void run(){
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");


        while(true){
            Date d = new Date();
            String date = f.format(d);
            if(date.equals("15:59:59")){
                System.out.println("hehe");
                try {

                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                d = new Date();
                long a = (15-d.getHours())* Long.valueOf("3600000000") +(59-d.getMinutes())*60000 + (59- d.getSeconds())*1000;
                System.out.println(date);
                try {
                    System.out.println(1);
                    Thread.sleep(a);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
