package basics.classtypes;// static : class level context : happens with class loading
// non static : object level : happens with object creation

public class StaticJava {

    // only non static members can be refered by this.
    int number = 0;

    static StaticJava staticJava;
    // created but not initialized

    // runs before static blocks, also runs the non static block
    static StaticJava staticJava2 = new StaticJava();

    static int staticVariable = 1;

    static {
        System.out.println("before constructor 2");
    }

    static {
        System.out.println("before constructor 1");
        StaticJava.method();
        System.out.println("value : "+ staticVariable);
        // illegal : System.out.println(this.number);
        StaticJava.init();
    }

    {
        // this is non static block
        System.out.println("only run when object is created");
    }

    StaticJava() {
        System.out.println("constructor");
    }
    // java has default constructor

    public static void main(String[] args) {
        new StaticJava();
        System.out.println("hello world");
        StaticJava.method();
    }

    static void method(){
        System.out.println("inside method");
    }

    void printer() {
        System.out.println("non static method");
    }

    static {
        StaticJava staticJava = new StaticJava();
        staticJava.printer();
    }

    static void init() {
        System.out.println("init method called");
        // object is recreated g
        StaticJava.staticJava2 = new StaticJava();
    }
}