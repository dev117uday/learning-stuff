package basics;

// everything in record is final and immutable
// you can create static variables
// you can create static and instance variables
// cannot inherit, can implements
// can create constructors
public record MyRecord(String name, Integer age) {

    public void printer() {
        System.out.println("name : " + name() + " age : " + age());
    }

    public MyRecord {
        if (name.isBlank()) {
            throw new IllegalArgumentException("name cannot be empty");
        }
    }

}

class MyRecordClass {
    public static void main(String[] args) {
        MyRecord myRecordClass = new MyRecord("uday", 12);
        System.out.println("name : " + myRecordClass.name() + " age : " + myRecordClass.age());
        myRecordClass.printer();

    }
}