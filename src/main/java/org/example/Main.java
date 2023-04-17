package org.example;
import java.sql.Array;
import java.util.Scanner;
import java.util.Random;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the width:");
//        double width = scanner.nextDouble();
//        System.out.print("Enter the height:");
//        double height = scanner.nextDouble();
//        Rectangle rectangle = new Rectangle(width, height);
//        System.out.println("Your Rectangle \n"+ rectangle.display());
//        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
//        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
//         // Rectangle
//        double a,b,c;
//        do {
//            System.out.println("Enter the a:");
//            a = scanner.nextDouble();
//        }
//        while (a==0.0);
//        System.out.println("Enter the b:");
//        b = scanner.nextDouble();
//        System.out.println("Enter the c:");
//        c = scanner.nextDouble();
//        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
//        if(quadraticEquation.getDiscriminant()>=0){
//            System.out.println("Roots=:"+quadraticEquation.getRoot1()+"and" +quadraticEquation.getRoot2());
//        }
//        else {
//            System.out.println("The equation has no roots");
//        }
//        int [] array = new int[100000];
//        Random rand = new Random();
//        for (int i=0;i< array.length;i++){
//            array[i]= rand.nextInt(array.length-1);
//        }
//        StopWatch  stopWatch =new StopWatch();
//        for (int i=0;i<array.length;i++) {
//            for (int j=i+1;j<array.length;j++){
//                if(array[i]>array[j]){
//                    int temp=array[j];
//                    array[j]=array[i];
//                    array[i]=temp;
//                }
//            }
//        }
//        stopWatch.Stop();
//        System.out.println(stopWatch.getStartTime());
//        System.out.println(stopWatch.getEndTime());
//        System.out.println(stopWatch.getElapsedTime());

          Fan fan1 = new Fan(3,true,10,"yellow");

          Fan fan2 = new Fan(2,false,5,"blue");
          System.out.println(fan1.toStringFan());

    }
}