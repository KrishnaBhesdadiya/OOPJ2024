import java.util.Scanner;
 class Circle{
        double radius;
        double areaOfCircle(){
            return Math.PI*radius*radius;
        }
    }
public class lab5 {
   
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius=10.0;
        double area = c1.areaOfCircle();
        System.out.println("area="+area);
    }
}
