
package bdatos;

import java.sql.*;
import javax.swing.JOptionPane;
import metodos.ConexionMySQL;
import metodos.*;


public class BDatos {

    public static void main(String[] args) {
        
        /*ConexionMySQL obx = new ConexionMySQL();
        obx.Conectar();*/
        
        FrameDatos fram = new FrameDatos();
        fram.setVisible(true);
       
    }
    
}
