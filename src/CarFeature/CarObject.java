package CarFeature;

public class CarObject {
    public static void main(String[] args) {

        /*
        [JA-1]
        Car car = new Car();
        car.brand="Renault";
        car.model="Clio";
        car.year=2024;

        System.out.println("Car Brand: " + car.brand);
        System.out.println("Car Model: " + car.model);
        System.out.println("Car Year: " + car.year);
         */

        Car car = new Car("Hyundai","Accent",1999);
        System.out.println("Car Brand: "+ car.brand);
        System.out.println("Car Model: "+ car.model);
        System.out.println("Car Year: "+ car.year);
    }
}
