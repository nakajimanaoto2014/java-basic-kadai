package Kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    HashMap<String, String> validInput = new HashMap<>();

    // コンストラクタ：有効な手を登録
    public Jyanken_Chapter28() {
        validInput.put("r", "r");
        validInput.put("s", "s");
        validInput.put("p", "p");
    }

    // ユーザーから入力を受け取り、バリデーションチェック
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String input = scanner.nextLine().toLowerCase().trim();  // String クラスのメソッド活用
        String hand = validInput.get(input);

        if (hand == null) {
            System.out.println("エラー：r / s / p のいずれかを入力してください。");
            return "エラー";
        }
        return hand;
    }

    // ランダムに対戦相手の手を決める（Mathクラスの使用）
    public String getRandom() {
        String[] hands = { "r", "s", "p" };
        int index = (int) Math.floor(Math.random() * 3); // Mathクラスの活用
        return hands[index];
    }

    // r, s, p を日本語に変換（String操作）
    public String toJapanese(String hand) {
        switch (hand) {
            case "r": return "グー";
            case "s": return "チョキ";
            case "p": return "パー";
            default:  return "不明";
        }
    }

    // 勝敗判定ロジック
    public void settlement(String myHand, String enemyHand) {
        if ((myHand.equals("r") && enemyHand.equals("s")) ||
            (myHand.equals("s") && enemyHand.equals("p")) ||
            (myHand.equals("p") && enemyHand.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else if (myHand.equals(enemyHand)) {
            System.out.println("あいこです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
