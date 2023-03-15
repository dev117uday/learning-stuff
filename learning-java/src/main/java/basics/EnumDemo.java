package basics;

import java.util.Arrays;

enum MyEnum {

    MySQL,
    Oracle,
    SqlServer;
}

public class EnumDemo {

    public static void main(String[] args) {
        System.out.println(MyEnum.MySQL);
        System.out.println(Arrays.stream(MyEnum.values()).toList());
        System.out.println(MyEnum.MySQL.ordinal());
    }
}

