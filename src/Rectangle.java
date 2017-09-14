/**
 * Created by michael_hopps on 9/12/17.
 */
public class Rectangle {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double x1, double y1, double x2, double y2){
        double length = Math.abs(x2 - x1);
        double width = Math.abs(y2 - y1);

        this.length = length;
        this.width = width;
    }

    //method:  public void name(){
    public void printArea(){
        double area = length*width;
        System.out.println(area);
    }

    //make a method that RETURNS the area, not just print
    public double getArea(){
        double area = length*width;
        return area;
    }



}
