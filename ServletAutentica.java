package control;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;



/**
 * Servlet implementation class ServletAutentica
 */
@WebServlet("/ServletAutentica")
public class ServletAutentica extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletAutentica() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Especificamos formato de respuesta, para decirle al servlet si responder en HTML o en programa JAVA
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//PrintWriter salida=response.getWriter();
	//Generar respuesta de la petición
	//salida.println("<html><body>");
	//salida.println("<h1 style='text-align:center'>Prueba Servlet</h1>");
	//salida.println("</body></html>");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String usuario, clave;
		usuario=request.getParameter("usuario");
		clave=request.getParameter("clave");
		if(usuario.equals("admininicial")&& clave.equals("admin123456")) {
			JOptionPane.showMessageDialog(null,"datos correctos");
			response.sendRedirect("vistados.jsp?dat="+usuario);

	}else {
		JOptionPane.showMessageDialog(null, "datos incorrectos");
		response.sendRedirect("index.jsp");
	}
	}

}
