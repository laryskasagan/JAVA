import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSet {

    public Connection conn(String dbname, String user, String pass) {

        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/registerdb","larysasagan","*******");
            if(conn != null){
                System.out.println("Connection established");
            }
            else {
                System.out.println("Connection failed");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

}
