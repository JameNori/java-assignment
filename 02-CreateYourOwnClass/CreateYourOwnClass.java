public class CreateYourOwnClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setSpeed(120);
        myCar.displayInfo();
    }
    
}
class Car {
    //สร้าง property แบบ private
    private String brand;
    private int speed;

    //เขียน getter/setter สำหรับแต่ละ property
    //setter
    public void setBrand(String newBrand) {
        brand = newBrand;
    }
    public void setSpeed(int newSpeed) {
        if (newSpeed > 0) {//validate data
            speed = newSpeed;
        } else {
            System.out.println("Speed must be greater than 0");
        }
    }
    //getter
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }

    //เขียน method displayInfo()
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}