package basics.classtypes.anoninner;

public class DriverManager {

    static Connection getConnection() {
        Connection con = new Connection(){

            @Override
            public void createStatement() {
                System.out.println("anonymous inner classes method");
            }
        };

        return con;
    }

}
