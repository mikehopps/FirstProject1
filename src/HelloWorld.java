/**
 * Created by michael_hopps on 9/5/17.
 */
public class HelloWorld {

    //This is a comment.  The compiler ignores this.
    //main method - this is the executed chunk of code
    //psvm TAB (ENTER)
    public static void main(String[] args) {
        //this is the print command!
//        System.out.println("5" + "4"); //sout TAB (ENTER)
//        //"5" string not a number
//        System.out.println(5 + -4);
//        //int -> integer!
//        System.out.println(72.41 + 0.5);

        //Variables!
        //1. The first time a var is used...
            //you need to DECLARE the var type...
        int age;  //declaration
        age = 36; //assignment (right to left)
        int heightInches = 72;
        //increase age by 1.  Happy birthday!
        age = age + 1;
        System.out.println(age);

        double price = 20; //double can hold an int...
        //make a var for pricePlusTax...tax is 6.25%
        double pricePlusTax = price * 1.0625;
        System.out.println(pricePlusTax);
//        age = price; //ints cannot hold doubles.
        System.out.println(7.001 + 2.1333);
        System.out.println(13.49 - .63);

    }
}
/*
This is a multiline comment!
You can make as many lines as you want in here.
So.  Cool.
*/
