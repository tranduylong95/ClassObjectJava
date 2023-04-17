package org.example;

public class Fan {
    private final  int SLOW=1,MEDIUM=2,FAST=3;
    private int speed;
    private boolean on;
    private double radius ;
    private String color;
    Fan(){
        this.speed=SLOW;
        this.on=false;
        this.radius=5;
        this.color="blue";
    }
    Fan(int speed,boolean on,double radius,String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    int getSpeed(){
        return this.speed;
    }
    boolean getOn(){
        return this.on;
    }
    double getRadius(){
        return this.radius;
    }
    String getColor(){
        return this.color;
    }
    void setSpeed(int speed){
        if(speed <= FAST && speed>0)
            this.speed= speed;
    }
    void setOn(){
        if(this.on)
            this.on=false;
        else
            this.on=true;
    }
    void setColor(String color){
        this.color=color;
    }
    void setRadius(double radius){
        this.radius =radius;
    }
     String toStringFan(){
        String str="Tốc độ quạt:";
        switch (this.speed){
            case 1:
                str+="SLOW";
                break;
            case 2:
                str+="MEDIUM";
                break;
            default:
                str+="FAST";
        }
        str+=",Màu sắc:"+this.color+",Đường Kính:"+this.radius;
        if(this.on)
            str+=",fan is on";
        else  str+="fan is off";
        return str;
    }
}