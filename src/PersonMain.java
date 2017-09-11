/**
 * Created by michael_hopps on 9/8/17.
 */
public class PersonMain {

    //main method here
    public static void main(String[] args) {
        Person hopps = new Person("Mr. Hopps", 36);
        Person jaylen = new Person("Jaylen", 17);

        hopps.sayHello();
        jaylen.sayHello();

        hopps.haveBirthday();
        jaylen.haveBirthday();

        hopps.sayHello();
        jaylen.sayHello();
    }


}
