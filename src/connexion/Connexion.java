package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private  static final String url="jdbc:mysql://localhost:3306/gestionhotel";
    private  static final String username="root";
    private  static final String password="";
    private  static final String Driver="com.mysql.cj.jdbc.Driver";
    private  static  Connection cnx=null;
    static {
        try {
            Class.forName(Driver);
            cnx = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getCnx(){
        return cnx;
    }


}
