package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.ClienteDAO;
import modelo.ClienteDTO;

/**
 * Servlet implementation class ServletCliente
 */
@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		/*El booelano trae un true o false de "insertarlinea"*/
		boolean x;
		
		
		int cedula_cliente;
		String nombre_cliente;
		String email_cliente;
		String direccion_cliente;
		String telefono_cliente;
		ClienteDTO clidto;
		ClienteDAO clidao;
		if(request.getParameter("btn_insertar")!=null) {
			nombre_cliente=request.getParameter("nomCli");
			cedula_cliente=parseInt(request.getParameter("cedCli"));
			direccion_cliente=request.getParameter("dirCli");
			email_cliente=request.getParameter("emaCli");
			telefono_cliente=request.getParameter("telCli");
			clidto= new ClienteDTO(cedula_cliente, nombre_cliente, email_cliente, direccion_cliente, telefono_cliente);
			clidao= new ClienteDAO();
			x=clidao.insertarlinea(clidto);
			if(x) {
				JOptionPane.showMessageDialog(null, "Cliente registrado con �xito.");
				response.sendRedirect("clientes.jsp");
			}else {
				JOptionPane.showMessageDialog(null, "Cliente no registrado.");
				response.sendRedirect("clientes.jsp");
			}
		}
		
	}

	private int parseInt(String parameter) {
		// TODO Auto-generated method stub
		return 0;
	}

}
