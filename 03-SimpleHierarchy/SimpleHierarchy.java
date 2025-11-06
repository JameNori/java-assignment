public class SimpleHierarchy {
    
    public static void main(String[] args) {
        // สร้าง object ของ Car
        Car myCar = new Car();
        myCar.brand = "Toyota"; // กำหนดค่า brand
        myCar.start();  // เรียก method start()
        myCar.drive();  // เรียก method drive()
    }
}

// Parent Class (คลาสแม่)
class Vehicle {
    String brand;  // property สำหรับเก็บยี่ห้อ
    
    // method สำหรับสตาร์ท
    public void start() {
        System.out.println(brand + " is starting...");
    }
}

// Child Class (คลาสลูก) - สืบทอดจาก Vehicle
class Car extends Vehicle {
    
    // method เพิ่มเติมสำหรับ Car
    public void drive() {
        System.out.println(brand + " is driving on the road.");
    }
}