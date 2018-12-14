package Shape;

public class Cone extends Triangle{
    public double getArea(){
        int radius = super.getBase();
        int height = super.getHeight();
        return Math.PI * radius * (radius + Math.sqrt(height*height + radius*radius));
    }
}
