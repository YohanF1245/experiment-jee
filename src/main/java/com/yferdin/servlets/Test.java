package com.yferdin.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		String dateFormated = now.format(formatterDate);
		String timeFormated = now.format(formatterTime);
		request.setAttribute("date", dateFormated);
		request.setAttribute("time", timeFormated);
		this.getServletContext().getRequestDispatcher("/WEB-INF/FirstPage.jsp").forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
