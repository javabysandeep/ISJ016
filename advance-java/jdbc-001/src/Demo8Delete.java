import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo8Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 01 : load and register the Driver with DriverManager
        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        //step 02 : get the connection from DriverManager by passing credentials
        Connection connection =
                DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        //step 03 : create the Statement type object
        Statement statement = connection.createStatement();

        //step 04 : execute the query
        String query = "delete from movie where id=2";
        statement.executeUpdate(query);//as query is DML

        //step 05 : close the connection
        connection.close();
        System.out.println("record deleted successfully");
    }

}