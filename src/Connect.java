import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {
    Connection con;
    public static Connection Connectdb()
    { 
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/HQ?user=root&password=mOmal12390");
        return con;
    }
        catch (Exception e)
        {
                    e.printStackTrace();
                    return null;
        } 
    }  
}
