package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GameRoom;
import model.Player;


@WebServlet("/servletA")
public class servletA extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 人数をリクエストパラメータから受け取る
		String pCount = request.getParameter("action");
		
		if(pCount.equals("1")) {
			//1人の時の処理
			
			// プレイヤーを生成して、ランダムに上の句か下の句を選ぶ
			int index = new Random().nextInt(2);
			Player player = new Player(index);
			GameRoom room = new GameRoom(player,index);
			
			HttpSession session = request.getSession();
			session.setAttribute("room", room);
			
			
			// 上の句か下の句をランダムでいれる
			// 
		} else {
			//2人の時の処理
			
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/input.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
