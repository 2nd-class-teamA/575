package model;

import java.io.Serializable;

public class GameRoom implements Serializable {
	private User[] room = new User[3];
	
	public GameRoom(CPU cpu) {
		// 配列の真ん中にCPUを格納する
		this.room[1] = cpu;
	}
	
	// ランダムで上の句か下の句を選択し、ユーザーを格納する
	public void random() {
		
	}

}
