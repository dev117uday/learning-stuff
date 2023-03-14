package basics;

// enable by -ea flag
// -da for disabling assertions
// -esa for system level assertions

public class MyAssert {

    public static void main(String[] args) {
        int one = 100;
        int two = 60;

        assert (one<two);
    }
}
