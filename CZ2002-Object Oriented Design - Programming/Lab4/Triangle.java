package Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private int base;
    private int height;

    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height= height;
    }

    @Override
    public double getArea(){
        return 0.5 * this.base * this.height;
    }

    @Override
    public void getDimension(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        this.base = sc.nextInt();
        System.out.print("Enter height : ");
        this.height = sc.nextInt();
    }
}
