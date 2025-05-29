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

        /*
        [JA-2]
        Car car = new Car("Hyundai","Accent",1999);
        System.out.println("Car Brand: "+ car.brand);
        System.out.println("Car Model: "+ car.model);
        System.out.println("Car Year: "+ car.year);
         */

        /*
        [JA-3]
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setYear(2023);
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
         */

        Car car = new Car("Hyundai","i20",2022,200);
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Speed: " + car.speed);
    }
}
