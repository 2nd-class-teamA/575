package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GameRoom implements Serializable {
	
	// 0:上の句 1:下の句 2:真ん中の句
	private User[] room = new User[3];
	// 上の句と下の句を格納するMap
	Map<String,String> haiku = new HashMap<>();
	
	int pCount = 0;
	
	// コンストラクタ マップを初期化する
	public GameRoom(int pCount) {
		this.pCount = pCount;
		
		haiku.put("kaminoku", null);
		haiku.put("mannaka", null);
		haiku.put("simonoku", null);
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
