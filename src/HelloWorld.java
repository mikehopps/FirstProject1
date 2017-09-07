/**
 * Created by michael_hopps on 9/5/17.
 */
public class HelloWorld {

    //This is a comment.  The compiler ignores this.
    //main method - this is the executed chunk of code
    //psvm TAB (ENTER)
    public static void main(String[] args) {

//        //Data Types!
//        //String - collection of characters in quotes!
//        System.out.println("Hello World!"); //sout TAB
//        //int - positive, negative whole #'s and 0
//        System.out.println(5);
//        System.out.println(4 + 7);
//
//        System.out.println("4" + "7");
//        //+ operator with strings! concatenation - sticks like glue
//
//        System.out.println(6.2 + 10.0/2.0);

        //variables!
        //1. Declare the var (age) and its type (int)
        //2. Assign the value (36)
        int age = 17;
        int heightInches;  //declare heightInches
        heightInches = 72; //assignment
        System.out.println(age);
        System.out.println(heightInches);
        //happy birthday! one year older!
        age = age + 1; //assignment goes right to left
        //age + 1 = age;  //NOPE
        System.out.println(age);

        //make a variable that is called price and holds the value 19.99
        double price = 19.99;
        //change price to reflect the 6.25% MA sales tax
        price = price * 1.0625;
        System.out.println(price); //21.239375

        //age = price;  //int cannot hold on to a double!
        price = age;
        System.out.println(33.95 - 71.047802);

    }
}

