package CarFeature;

public class Vehicle {
    public int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public static int Multi(int number1, int number2){
        return number1*number2;
    }

    public void start (){
        System.out.println("Vehicle started");
    }
}
