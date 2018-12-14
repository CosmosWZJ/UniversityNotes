package Shape;

import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of shapes : ");
        int size = sc.nextInt();
        Shape[] shapes = new Shape[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter shape" + (i+1) + " 1 as Triangle, 2 as Circle, 3 as Rectangle : ");
            int c = sc.nextInt();
            switch(c) {
                case 1:
                    Triangle tri = new Triangle();
                    tri.getDimension();
                    shapes[i] = tri;
                    break;
                case 2:
                    Circle cir = new Circle();
                    cir.getDimension();
                    shapes[i] = cir;
                    break;
                case 3:
                    Rectangle rec = new Rectangle();
                    rec.getDimension();
                    shapes[i] = rec;
                    break;
                default:
                    break;
            }
        }
        double result = 0;
        for(Shape s : shapes) {
            result += s.getArea();
        }
        System.out.println("Total Area : " + result);

    }
}
