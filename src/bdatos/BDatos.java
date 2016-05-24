
package bdatos;

import java.sql.*;
import javax.swing.JOptionPane;
import metodos.ConexionMySQL;
import metodos.FrameConex;


public class BDatos {

    public static void main(String[] args) {
        
        /*ConexionMySQL obx = new ConexionMySQL();
        obx.Conectar();*/
        
        FrameConex fram = new FrameConex();
        fram.setVisible(true);
       
    }
    
}
