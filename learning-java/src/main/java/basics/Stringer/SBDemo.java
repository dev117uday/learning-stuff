package basics.Stringer;

// String is immutable
// StringBuffer and StringBuilder are mutable
// StringBuffer is sync
// StringBuilder is not sync

public class SBDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("All the power").append("is within you");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(10));


    }
}
