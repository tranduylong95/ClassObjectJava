package org.example;
import java.util.Date;
public class StopWatch {
    private long startTime=System.currentTimeMillis();
    private long endTime;
    StopWatch(){
    }
    String getStartTime(){
        Date date = new Date(this.startTime);
        return date.toString();
    }
    String getEndTime(){
        Date date = new Date(this.endTime);
        return date.toString();
    }
    void Start(){
        this.startTime=System.currentTimeMillis();
    }
    void Stop(){
        this.endTime=System.currentTimeMillis();
    }
    long getElapsedTime(){
        return this.endTime- this.startTime;
    }
}
