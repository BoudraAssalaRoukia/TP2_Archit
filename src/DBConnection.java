import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "Archilog";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
        private static DBConnection instance;
	   
	   private DBConnection()  {
			conn=DriverManager.getConnection(url, user,passwd);
		}
        
	   public static DBConnection getInstance() {
		   if(instance==null) {
			   instance = new DBConnection();
		   }
		   return instance;
	   }
	    
	    public Connection getConn() {
			return conn;
		}


		
	
}
