package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("testUp.jsp").forward(
					request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
