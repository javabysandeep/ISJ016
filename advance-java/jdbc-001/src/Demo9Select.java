import java.sql.*;

public class Demo9Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 01 : load and register the Driver with DriverManager
        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        //step 02 : get the connection from DriverManager by passing credentials
        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        //step 03 : create the Statement type object
        Statement statement = connection.createStatement();

        //step 04 : execute the query
        String query = "select * from course";
        ResultSet resultSet = statement.executeQuery(query);//as query is DQL

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + "\t"
                            + resultSet.getString("course_name") + "\t"
                            + resultSet.getInt("price")

            );
        }

        //step 05 : close the connection
        connection.close();
    }

}