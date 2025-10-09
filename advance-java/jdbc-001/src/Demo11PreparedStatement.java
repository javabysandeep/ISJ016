import java.sql.*;
import java.util.Scanner;

public class Demo11PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 01 : load and register the Driver with DriverManager
        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        //step 02 : get the connection from DriverManager by passing credentials
        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        //step 04 : execute the query
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id and title");
        int id = scanner.nextInt();
        String title = scanner.next();

        String query = "insert into movie(id, title) values(?,?)";

        //step 03 : create the PreparedStatement type object
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, title);


        preparedStatement.executeUpdate();

        //step 05 : close the connection
        connection.close();
        System.out.println("record inserted");
    }

}