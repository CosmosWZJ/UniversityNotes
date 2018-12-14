package Shape;



public class Pyramid extends Triangle {

   public double getArea(){
       return super.getArea() * 4 + super.getBase() * super.getBase();
   }
}
