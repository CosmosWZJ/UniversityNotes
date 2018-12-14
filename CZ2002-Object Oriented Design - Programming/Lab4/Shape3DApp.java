package Shape;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes : ");
        int size = sc.nextInt();
        Shape[] shapes = new Shape[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter shape" + (i+1) + " 1 Pyramid, 2 Sphere, 3 Cuboid, 4 Cone, 5 Cylinder: ");
            int c = sc.nextInt();
            switch(c) {
                case 1:
                    Pyramid p = new Pyramid();
                    p.getDimension();
                    shapes[i] = p;
                    break;
                case 2:
                    Sphere s = new Sphere();
                    s.getDimension();
                    shapes[i] = s;
                    break;
                case 3:
                    Cuboid cu = new Cuboid();
                    cu.getDimension();
                    shapes[i] = cu;
                    break;
                case 4:
                    Cone co = new Cone();
                    co.getDimension();
                    shapes[i] = co;
                    break;
                case 5:
                    Cylinder cy = new Cylinder();
                    cy.getDimension();
                    shapes[i] = cy;
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