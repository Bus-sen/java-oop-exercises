import animals.Cats;
import animals.Dogs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        [JA-8]
        System.out.println("Sonuç: " + Vehicle.Multi(5,9));
         */

        /*
        [JA-6]
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        dog.makeSound();
         */

        /*
        [JA-7]
        System.out.println("Result: " + Calculator.add(23,14));
        System.out.println("Result2: " + Calculator.add(11,8,20));
         */

        /*
        [JA-10]
        Circle circle = new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
         */

        //[JA-11]
        Cats cats = new Cats();
        cats.sound();
        Dogs dogs = new Dogs();
        dogs.sound();
    }
}