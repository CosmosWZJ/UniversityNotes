package Shape;

import java.util.Scanner;

public class Cylinder extends Rectangle {
    private Rectangle cub = new Rectangle();

    @Override
    public double getArea() {
        int height = cub.getLength();
        int radius = cub.getBreadth();
        return 2 * Math.PI * radius * (radius + height);

    }
    public void getDimension(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height : ");

        cub.setLength(sc.nextInt());
        System.out.print("Enter radius : ");
        cub.setBreadth(sc.nextInt());
    }


}
