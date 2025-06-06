package CarFeature;

public class Car extends Vehicle {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year, int speed) {
        super(speed);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public void start(){
        System.out.println("Car starts");
    }

    /*
    public Car (){

    }
     */

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
