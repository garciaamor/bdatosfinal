

package metodos;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jgarciaamor
 */
public class ConexionMySQL {
    
    public String db = "jgarciaamor";
    public String url = "jdbc:mysql://10.0.0.254/"+db;
    public String user = "jgarciaamor";
    public String pass = "jgarciaamor";


    
    
    
   public Connection Conectar(){

       Connection link = null;

       try{

           Class.forName("org.gjt.mm.mysql.Driver");

           link = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex.getMessage());

       }


       return link;

   }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

      
   
   
    
}
