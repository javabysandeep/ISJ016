import java.sql.*;

public class Demo3Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //steps to connect java app to the db
        //step 01 : create the project and add the connector jar to the project

        //step 02 : load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 03 : Get the Connection from DriverManager
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //Step 04 : create the Statement type Object in order to execute the query
        Statement statement = connection.createStatement();

        //step 05 : execute the query
        ResultSet resultSet = statement.executeQuery("select * from course");

        //step 06 : use the result

        while (resultSet.next()) {
            //specify the columnLabel
            System.out.println(
                    resultSet.getInt("id") + "\t" +
                            resultSet.getString("course_name") + "\t" +
                            resultSet.getInt("price"));

            //specify the column index
            //System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3));
        }


        //step 07: close the connection
        connection.close();
    }
}
