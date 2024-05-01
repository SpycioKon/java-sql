import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ctf","root","");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");k
            while (rs.next()){
                System.out.printf("%s|%s|%s|%s|%s|%s\n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
