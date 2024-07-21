package upcasting;

public class Benz extends Vehicle {
    @Override
    void start() {
        System.out.println("Benz started..");
    }

    @Override
    void accelerate() {
        System.out.println("Benz is going");
    }

    @Override
    void stop() {
        System.out.println("Benz stops");
    }
}
