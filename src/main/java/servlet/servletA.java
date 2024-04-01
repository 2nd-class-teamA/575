package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			Player player = new Player();
			Random r = new Random();
			GameRoom room = new GameRoom(player,r.nextInt(2));
			
			
			
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
