/**
 * Created by michael_hopps on 9/12/17.
 */
public class MainMath {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(100, 200, 500, 125); //len=100, wid=75

        double sumArea = rect1.getArea() + rect2.getArea();
        System.out.println(sumArea);

        //
//        Cylinder can = new Cylinder(4, 2);
//
//        can.printVolume();
//
//        can.scaleBy(2);
//
//        can.printVolume();






    }
}
