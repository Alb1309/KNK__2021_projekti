package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteConnection {

    public static Connection Connector(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:src/sample/Database/WarehouseDB.sqlite");
            return con;
        }
        catch (Exception e){
            return  null;
        }
    }
}
