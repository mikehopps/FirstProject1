/**
 * Created by michael_hopps on 9/12/17.
 */
public class Cylinder {

    private double radius, height;

    public Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    public void printVolume(){
        double volume = Math.PI*radius*radius*height;
        System.out.println(volume);
    }

    public void scaleBy(double factor){
        height = height * factor;
        radius *= factor;
    }

}
