package Kadai_028;

import java.util.HashMap;
import java.util.Random;
public class Jyanken_Chapter28 {
	
	//faitin宣言
	HashMap<String,String> faitin = new HashMap<>();
	//コンストラクタ初期
	
	public Jyanken_Chapter28() {
	faitin.put("r","r");
	faitin.put("s","s");
	faitin.put("p","p");
	} 
	
	public String getMyChoice(String userInport) {
		String myHand = faitin.get(userInport);
	if(myHand != null && (myHand.equals( "r")||myHand.equals("s")||myHand.equals("p"))) {
		System.out.println(myHand);
		 return myHand;
	} 
	else {
		System.out.println("エラー");
		return "エラー";
	}
	}
	public String toJapanese(String hand) {
		switch(hand){
			case "r": return "グー";
			case "s": return "チョキ";
			case "p": return "パー";
			default: return "不明";
		}
	}
	//対戦相手の手をランダムに決める
		public String getRandom() {
			String[] hands = { "r", "s", "p" }; // じゃんけんの手を配列に
			int randNum = (int)Math.floor(Math.random() * 3); // 0～2
			return hands[randNum];
	
	}
	public void Settlement(String myHand, String enemyHand) {
		if( myHand.equals("r") && enemyHand.equals("s")) {
			System.out.println("自分の勝ちです");
		}
		else if(myHand.equals("s") && enemyHand.equals("p")) {
			System.out.println("自分の勝ちです");
		}
		else if(myHand.equals("p") && enemyHand.equals("r")) {
			System.out.println("自分の勝ちです");
		}
		else if (myHand.equals(enemyHand)){
			System.out.println("あいこです");
		}
		else {
			System.out.println("自分の負けです");
		}
	}
}
