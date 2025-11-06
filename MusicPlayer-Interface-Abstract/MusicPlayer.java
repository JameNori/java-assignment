public class MusicPlayer{

    public static void main(String[] args) {


        CDPlayer cdPlayer = new CDPlayer("Sony");
        cdPlayer.connect();
        cdPlayer.info();
        cdPlayer.play();

        System.out.println("-------------------");

        Smartphone smartphone = new Smartphone("Apple");
        smartphone.connect();
        smartphone.info();
        smartphone.play();
    }
    
}

// สร้าง interface ชื่อ Playable
interface Playable {
    void play();
}

// สร้าง abstract class ชื่อ MusicDevice
abstract class MusicDevice {
    private String brand;

    public MusicDevice(String brand) {
        this.brand = brand;
    }

    public void info() {
        System.out.println("Music player brand: " + brand);
    }

    public abstract void connect();
}

// สร้าง class ชื่อ CDPlayer
class CDPlayer extends MusicDevice implements Playable {

    public CDPlayer(String brand) {
        super(brand);
    }

    @Override
    public void connect() {
        System.out.println("Connecting the CD...");
    }

    @Override
    public void play() {
        System.out.println("Playing music from CD");
    }
}

// สร้าง class ชื่อ Smartphone
class Smartphone extends MusicDevice implements Playable {

    public Smartphone(String brand) {
        super(brand);
    }

    @Override
    public void connect() {
        System.out.println("Connecting via Bluetooth...");
    }

    @Override
    public void play() {
        System.out.println("Playing music from Spotify");
    }
}