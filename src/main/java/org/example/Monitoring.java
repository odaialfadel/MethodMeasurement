package org.example;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Monitoring implements MonitorTimer{

    private long start;
    private long end;
    private static Monitoring monitoring;
    private Monitoring(){}

    public static MonitorTimer getInstance(){
        if(monitoring == null) {
            return new Monitoring();
        }
        return monitoring;
    }

    @Override
    public void start() {
        setStart(System.currentTimeMillis());
    }

    @Override
    public void stop() {
       setEnd(System.currentTimeMillis());
        long duration = getEnd() - getStart();
        System.out.println("Time takes to proceed: " + duration + " ms");
    }
}
