/**
 * Created by michael_hopps on 9/13/17.
 */
public class Triangle {

    private double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void printArea(){
        double area = base*height/2;
        System.out.println(area);
    }

    //make a method that RETURNS the area, rather than simply printing
    public double getArea(){
        double area = base*height/2;
        return area;
    }

}
