package model;

import java.io.Serializable;

public class GameRoom implements Serializable {
	
	// 0:上の句 1:下の句 2:真ん中の句
	private User[] room = new User[3];
	// プレイヤーの人数を管理する変数
	private int pCount = 0;
	
	// プレイヤーの人数を設定する
	public GameRoom(int pCount) {
		this.pCount = pCount;
	}
	
	// 空いている配列にCPUを入れる処理
	public void createCPU() {
		for(int i = 0; i <= 2; i++) {
			if(room[i] == null) {
				CPU cpu = new CPU(i);
			}
		}
	}
	
	// プレイヤーの人数を取得する
	public int getPCount() {
		return this.pCount;
	}
	
	// プレイヤーが入った配列を取得する
	public User[] getRoom() {
		return this.room;
	}
	
	// プレイヤーが入った配列のnullチェック
	public boolean isNull(int i) {
		if(room[i] == null) {
			return true;
		}
		return false;
	}
}
