import java.sql.*;
import java.util.Scanner;

public class Demo12CreateProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 01 : load and register the Driver with DriverManager
        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        //step 02 : get the connection from DriverManager by passing credentials
        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        //step 03 : create the callable type object
        String query = "create procedure it_shaala.course_proc() begin insert into course(id, course_name, price) values(1011, 'security',99); end";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();

        //close the connection
        connection.close();
        System.out.println("procedure created");
    }

}