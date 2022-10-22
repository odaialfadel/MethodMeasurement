package org.example;

public class Main {
    static MonitorTimer monitorTimer = Monitoring.getInstance();
    public static void main(String[] args) {

        monitorTimer.start();
        loop();
        monitorTimer.stop();
    }
    static void loop(){
        for(int i = 0; i<=1000_000; i++){
            System.out.println(i);
        }
    }

}