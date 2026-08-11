import java.sql.*;

public class Main {

    public static void main(String[] args) {

        // Database URL
        String url = "jdbc:mysql://localhost:3306/studentdb";

        // Username
        String user = "root";

        // Password
        String password = "root";

        try {

            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected Successfully!");

            // Step 3: Create Statement
            Statement st = con.createStatement();

            // Step 4: Execute SQL Query
            ResultSet rs =
                st.executeQuery("SELECT * FROM student");

            // Step 5: Read Data
            while(rs.next()){

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + " "
                        + name + " "
                        + marks);
            }

            // Step 6: Close Everything
            rs.close();
            st.close();
            con.close();

            System.out.println("Connection Closed");

        }
        catch(Exception e){

            e.printStackTrace();

        }

    }

}