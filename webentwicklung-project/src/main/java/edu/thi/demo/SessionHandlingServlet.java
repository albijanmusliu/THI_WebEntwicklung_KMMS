package edu.thi.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SessionHandlingServlet")
public class SessionHandlingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if ("writeToSession".equals(action)) {
			String vorname = request.getParameter("vorname");
			String nachname = request.getParameter("nachname");

			HttpSession session = request.getSession();
			session.setAttribute("vorname", vorname);
			session.setAttribute("nachname", nachname);

			out.println("<html><body>");
			out.println("<h1>Schreiben von Daten in eine Sitzung</h1>");
			out.println("<p>Sessiondaten wurden erfolgreich geschrieben!</p>");
			out.println("<form method='get' action='SessionHandlingServlet'>");
			out.println("<input type='hidden' name='action' value='readFromSession' />");
			out.println("<input type='submit' value='Daten aus Session lesen' />");
			out.println("</form>");
			out.println("</body></html>");
		} else if ("readFromSession".equals(action)) {
			HttpSession session = request.getSession();
			String vorname = (String) session.getAttribute("vorname");
			String nachname = (String) session.getAttribute("nachname");

			out.println("<html><body>");
			out.println("<h1>Lesen von Daten aus einer Sitzung</h1>");
			out.println("<p>Vorname: " + vorname + "</p>");
			out.println("<p>Nachname: " + nachname + "</p>");
			out.println("</body></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}