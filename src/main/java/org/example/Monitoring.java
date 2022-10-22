package org.example;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Monitoring implements MonitorTimer{

    private long start;
    private long end;


    @Override
    public void start() {
        setStart(System.currentTimeMillis());
    }

    @Override
    public void stop() {
       setEnd(System.currentTimeMillis());
        long duration = getEnd() - getStart();
//        duration = duration / 1000;
        System.out.println("Time takes to proceed: " + duration + " ms");
    }
}
