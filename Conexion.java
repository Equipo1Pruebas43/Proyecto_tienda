package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
	
	Connection cnn;
	public Connection conexionbd() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				cnn=DriverManager.getConnection("jdbc:mysql://localhost/tienda_generica","root","root1941");
				JOptionPane.showMessageDialog(null, "Conexión de BD exitosa");
			}catch(SQLException e){
				e.printStackTrace();	
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return cnn;
	}
	
}
