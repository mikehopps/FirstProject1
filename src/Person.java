/**
 * Created by michael_hopps on 9/8/17.
 */
public class Person {

    //Instance Fields!
    //Big important variables for this class.
    //declare, but don't assign value.
    //always private.
    private int age;
    private String name;

    //The constructor.
    //The job of the constructor is:
    //assign value to the instance fields
    public Person(String n, int a){
        name = n;
        age = a;
    }

    //methods!  the actions a Person can perform.
    public void sayHello(){
        System.out.println("Hi! My name is " + name + ", and I'm " + age
            + " years old.");
    }

    public void haveBirthday(){
//        age = age + 1;
//        age += 1;
        age++;  //increment operator: adds one to variable
    }


}
