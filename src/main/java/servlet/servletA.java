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


@WebServlet("/servletA")
public class servletA extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 人数をリクエストパラメータから受け取る
		int pCount = Integer.parseInt(request.getParameter("action"));
		// プレイ人数をGameRoomに設定
		GameRoom room = new GameRoom(pCount);
		// GameRoomをセッションに格納
		HttpSession session = request.getSession();
		session.setAttribute("room", room);
		
		System.out.println(pCount);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/input.jsp");
		rd.forward(request, response);
		
		doPost(request, response);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// セッションからroomインスタンスを取得
		HttpSession session = request.getSession();
		GameRoom room = (GameRoom) session.getAttribute("room");
		
		// 入力画面から文を受け取る
		
		
		
		int index = (int) request.getAttribute("game");
		
		// ランダムに上の句か下の句を選ぶ
		int r = new Random().nextInt(2);
		if(room.isNull(r)) {
			request.setAttribute("odai", r);
			// 入力画面へフォワード
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/input.jsp");
			rd.forward(request, response);
		}
		
		// 全部がnullじゃなかったら結果出力画面へフォワード
		
		int pCount = room.getPCount();
		for(int i = 1; i <= pCount; i++) {
			
		}
	}

}
