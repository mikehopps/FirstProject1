/**
 * Created by michael_hopps on 9/12/17.
 */
public class MainMath {

    public static void main(String[] args) {

        Cylinder can = new Cylinder(4, 2);

        can.printVolume();
        can.scaleBy(2);

        can.printVolume();

    }
}
