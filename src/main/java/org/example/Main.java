package org.example;

public class Main {
    public static void main(String[] args) {
        MonitorTimer monitorTimer = Monitoring.getInstance("loop");
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