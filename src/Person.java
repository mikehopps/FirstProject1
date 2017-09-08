/**
 * Created by michael_hopps on 9/8/17.
 */
public class Person {

    //instance fields - the modeling variables
    //declare the instance fields - the value will come later
    private int age;  //always    private type name;
    private String name;

    //constructor - how to build one of these Person things
    //job: make sure all instance fields have a value
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //methods - the actions a Person can perform

    public void sayHello(){
        System.out.println("Hi! My name is " + name + ", and I'm " + age + " years old.");
    }
}
