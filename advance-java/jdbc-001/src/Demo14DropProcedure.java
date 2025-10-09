import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo14DropProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 01 : load and register the Driver with DriverManager
        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        //step 02 : get the connection from DriverManager by passing credentials
        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        //step 03 : create the callable type object
        String query = "drop procedure it_shaala.course_proc";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();

        //close the connection
        connection.close();
        System.out.println("procedure dropped");
    }

}