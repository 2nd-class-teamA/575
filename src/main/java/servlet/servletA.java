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
		
		doPost(request, response);
		
//		if(pCount.equals("1")) {
//			//1人の時の処理
//			
//			// プレイヤーを生成して、ランダムに上の句か下の句を選ぶ
//			int index = new Random().nextInt(2);
//			Player player = new Player(index);
//			GameRoom room = new GameRoom(player,index);
//			
//			HttpSession session = request.getSession();
//			session.setAttribute("room", room);
//			
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/input.jsp");
//			rd.forward(request, response);
//			
//			// 上の句か下の句をランダムでいれる
//			// 
//		} else {
//			//2人の時の処理
//			
//		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// セッションからroomインスタンスを取得
		HttpSession session = request.getSession();
		GameRoom room = (GameRoom) session.getAttribute("room");
		int index = (int) request.getAttribute("game");
		
		// ランダムに上の句か下の句を選ぶ
		int r = new Random().nextInt(2);
		if(room.isNull(r)) {
			request.setAttribute("odai", r);
			// 入力画面へフォワード
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/input.jsp");
			rd.forward(request, response);
		}
		
		int pCount = room.getPCount();
		for(int i = 1; i <= pCount; i++) {
			
		}
	}

}
