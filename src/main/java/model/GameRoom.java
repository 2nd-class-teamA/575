package model;

import java.io.Serializable;

public class GameRoom implements Serializable {
	
	// 0:上の句 1:下の句 2:真ん中の句
	private User[] room = new User[3];
	
	// プレイヤーを配列に格納する
	public GameRoom(Player p, int i) {
		room[i] = p;
	}
	
	// 空いている配列にCPUを入れる処理

}
