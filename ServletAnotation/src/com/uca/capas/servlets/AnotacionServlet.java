package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnotacionServlet
 */
@WebServlet("/AnotacionServlet")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnotacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			String regxuser="agmeag";
			String regxpass="159753";
			PrintWriter out = response.getWriter();
			if(request.getParameter("user")!=null && request.getParameter("password")!=null ) {
			String user = request.getParameter("user").toString();
			String pass=request.getParameter("password").toString();
			out.println("<html>");
			out.println("<body>");
			if(user.equals(regxuser) && pass.equals(regxpass)) {
				out.println("<h2><strong>Credenciales v&aacutelidas has iniciado Sesi&oacuten.</strong></h2>");
				
			}else {
				out.println("<h2><strong>Credenciales inv&aacutelidas no posees acceso.</strong></h2>");
			}
			out.println("</body>");
			out.println("</html>");
			}else {
				out.println("<html>");
				out.println("<body>");
				out.println("<h2><strong>Ups! Algo anda mal...</strong></h2>");
				out.println("</body>");
				out.println("</html>");
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
