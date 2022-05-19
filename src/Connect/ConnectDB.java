package Connect;


import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectDB {
    
    
     public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }   
//      public String getImagePath() throws Exception {
//        return "image/";
//    }
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "DESKTOP-K2CL5O2";
    private final String dbName = "QUANLYKHACHSAN";
    private final String portNumber = "1433";
    private final String instance="";//
    private final String userID = "sa";
    private final String password = "123456";
}
 