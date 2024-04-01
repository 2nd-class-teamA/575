package model;

import java.io.Serializable;

public class GameRoom implements Serializable {
	
	// 0:上の句 1:下の句 2:真ん中の句
	private User[] room = new User[3];
	// 現在のの配列の位置を記憶する変数
	int ptr = 0;
	
	
	// プレイヤーを配列に格納する
	public GameRoom(Player p, int i) {
		room[i] = p;
	}
	
	// 空いている配列にCPUを入れる処理
	public void createCPU() {
		for(int i = 0; i <= 2; i++) {
			if(room[i] == null) {
				CPU cpu = new CPU(i);
			}
		}
	}
}
