package Kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//インスタンス作成
		Jyanken_Chapter28 janken = new Jyanken_Chapter28();
		
		//ユーザーに入力してもらう
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String userInput = scanner.nextLine(); //入力受け取り
		
		//自分の手を取得
		String myHand = janken.getMyChoice(userInput);
		
		//エラーが出なければ続行
		if(!myHand.equals("エラー")) {
			String enemyHand = janken.getRandom(); //相手の手をランダム取得
	
			System.out.println("自分の手は" + janken.toJapanese(myHand) + "," +  "対戦相手の手は" + janken.toJapanese(enemyHand));
			janken.Settlement(myHand, enemyHand); //勝敗判定
		}
		scanner.close();        //スキャナを閉じる
	}
	
}
