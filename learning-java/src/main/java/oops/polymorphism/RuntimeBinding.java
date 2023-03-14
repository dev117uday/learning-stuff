package oops.polymorphism;

class Macbook {
    void start() {
        System.out.println("macbook start");
    }

    void stop() {
        System.out.println("macbook shutdown");
    }
}

class MacbookAir extends Macbook {
    @Override
    void start() {
        System.out.println("macbook air start");
    }

    @Override
    void stop() {
        System.out.println("macbook air stop");
    }
}

public class RuntimeBinding {

    public static void main(String[] args) {
        Macbook laptop = new MacbookAir();
        laptop.start();
        laptop.stop();
    }
}
