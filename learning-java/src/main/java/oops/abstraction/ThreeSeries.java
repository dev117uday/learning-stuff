package oops.abstraction;

// must provide override method, can be marked as final, if all methods are implemented
public class ThreeSeries extends BMW {
    @Override
    void accelerate() {
        System.out.println("this is 3 series");
    }
}
