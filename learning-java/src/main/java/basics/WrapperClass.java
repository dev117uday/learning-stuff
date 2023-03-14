package basics;// helps to convert primitive type to Reference Type

//- Primitive to Object : boxing
//- Object to Primitive : unboxing
//- Primitive to String
//- String to Primitive
//- Object to String
//- String to Object
//- upcasting : child object to parent
//- downcasting : parent object to child

public class WrapperClass {

    public static void main(String[] args) {
        int i = 100;
        Integer integer = Integer.valueOf(i);
        int j = integer.intValue();

        String intString = Integer.toString(i);
        Integer stringInt = Integer.parseInt(intString);

        long x = 1000;
        Long y = Long.valueOf(x);
        String s = y.toString();
        Long z = Long.parseLong(s);

        long l = 1000;
        // this will be deprecated
        // Long ll = new Long(l);
    }
}
