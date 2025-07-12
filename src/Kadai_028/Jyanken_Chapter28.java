package Kadai_028;

public class JyankenExec_Chapter28 {

    public static void main(String[] args) {
        Jyanken_Chapter28 janken = new Jyanken_Chapter28();

        // 入力処理
        String myHand = janken.getMyChoice();

        if (!myHand.equals("エラー")) {
            // 相手の手を決める
            String enemyHand = janken.getRandom();

            // 出力処理
            System.out.println("自分の手は" + janken.toJapanese(myHand) +
                               ",対戦相手の手は" + janken.toJapanese(enemyHand));

            // 勝敗の判定
            janken.settlement(myHand, enemyHand);
        }
    }
}
