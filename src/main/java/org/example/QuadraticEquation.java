package org.example;
import java.lang.Math;
public class QuadraticEquation {
    private double a,b,c;
    QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2)-4*this.a*this.c;
    }
    public double getRoot1(){
        return (-b+Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }
    public double getRoot2(){
        return (b+Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }
}
