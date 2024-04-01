package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletA")
public class servletA extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 人数をリクエストパラメータから受け取る
		String pCount = request.getParameter("action");
		
		if(pCount.equals("1")) {
			//1人の時の処理
			
		} else {
			//2人の時の処理
			
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/input.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
