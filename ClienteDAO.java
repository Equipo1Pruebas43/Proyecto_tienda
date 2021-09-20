package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import control.Conexion;

public class ClienteDAO {
	Conexion con= new Conexion();
	Connection cnn=con.conexionbd();
	PreparedStatement ps;
	
	public boolean insertarlinea(ClienteDTO cli) {
		int r;
		boolean dat=false;
		try {
			ps=cnn.prepareStatement("INSERT INTO cliente values(?,?,?,?,?)");
			ps.setInt(1, cli.getDoc);
			ps.setString(2, cli.getNombre_cliente());
			r=ps.executeUpdate();
			if(r>0) {
				dat=true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return dat;
	}
}
