package upcasting;

public class BMW extends Vehicle {
    @Override
    void start() {
        System.out.println("BMW started..");
    }

    @Override
    void accelerate() {
        System.out.println("BMW is going");
    }

    @Override
    void stop() {
        System.out.println("BMW stops");
    }
    void autopilot() {
    	System.out.println("AUto pilot is started");
    }
}
