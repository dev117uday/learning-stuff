package oops.abstraction;

// abstract : not implemented, hides details
// using interface and abstract
// abstract class cannot be instantiated

public class Runner {

    public static void main(String[] args) {
        System.out.println("abstract class main");

        // illegal : BMW car = new BMW();

        ThreeSeries ts = new ThreeSeries();
        FiveSeries fs = new FiveSeries();

        ts.commonfunc();
        ts.accelerate();
    }
}
