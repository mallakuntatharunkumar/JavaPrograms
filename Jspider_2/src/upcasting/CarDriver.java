package upcasting;

public class CarDriver {
    void drive(Vehicle v) {
        v.start();
        v.accelerate();
        v.stop();
        //v.autopilot();//CTE
    }
    public static void main(String[] args) {
        CarDriver c = new CarDriver();
        c.drive(new Benz());
        c.drive(new BMW());
    }
}
