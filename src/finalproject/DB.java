package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    Connection conn;
    Statement st;

    public DB() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=finalproject","sa","12345");
        st = conn.createStatement();
    }
    
    public void Close() throws SQLException
    {
        st.close();
        conn.close(); 
    }

}
