package Kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		//車クラスのインスタンスを作成する
		Car_Chapter15 car = new Car_Chapter15();
		Car_Chapter15 gear = new Car_Chapter15();
		//クラスのgearChangeメソッドの引数に3を設定して実行する
		car.gearChange(3);
		
		// 車クラスのrunメソッドを実行する
		car.run();

	}

}
