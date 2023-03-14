package basics.classtypes.anoninner;

public class AnonDemo {
    public static void main(String[] args) {
        Connection con = DriverManager.getConnection();
        con.createStatement();
    }
}
