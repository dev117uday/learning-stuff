package basics;

public class DataTypes {

    byte a = -50;
    short b = 150;
    int c = 10000;
    long d = 10000000;
    char e = 'A';
    float f = 1.21f;
    double g = 123.43454;

    // local variables dont have public, private etc..

    // type casting
    public static void main(String[] args) {
        DataTypes dt = new DataTypes();

        // implicit casting
        int i = dt.a;
        int j = dt.b;
        System.out.println(i + " " + j);

        //explicit casting
        byte k = (byte) i;
        System.out.println(k);

        // beyond the limits, wraps around
        i = 130;
        byte l = (byte)i;
        System.out.println(l);

        i = 612;
        byte m = (byte)i;
        char n = (char)m;
        System.out.println(n);
    }
}
