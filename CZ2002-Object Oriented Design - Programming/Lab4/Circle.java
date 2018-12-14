package Shape;

import java.util.Scanner;

public class Circle extends Shape{
    private int Radius;
//    public Circle(int r){
//        Radius = r;
//    }

    public int getRadius(){
        return Radius;
    }
    public void setRadius(int r){
        Radius = r;
    }

    @Override
    public double getArea(){
        return Math.PI * Radius *Radius;
    }

    @Override
    public void getDimension(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        this.Radius = sc.nextInt();
    }

}
