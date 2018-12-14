package Shape;

import java.util.Scanner;

public class Cuboid extends Rectangle{
    private Rectangle cub = new Rectangle();
    @Override
    public double getArea() {
        return (super.getArea() * 4) + (this.getBreadth() * this.getBreadth() * 2);
    }
    public void getDimension(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");

        this.setLength(sc.nextInt());
        System.out.print("Enter width : ");
        this.setBreadth(sc.nextInt());
    }
}
