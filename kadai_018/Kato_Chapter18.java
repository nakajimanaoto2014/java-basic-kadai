package kadai_018;

abstract public class Kato_Chapter18 {  //個別の紹介を出力する
	
	//親クラスの作成　フィールド名
	public String familyName; //姓を表す
	public String giveName;   //名を表す
	public String address;    //住所を表す
	
	
	
	//親クラスのメソッド()
	
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + giveName + "です");
		System.out.println("住所は" + address + "です");
		
	}
	//抽象メソッド(個別紹介)
	abstract void eachIntroduce();
	//紹介を実行する(共通 + 個別)
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println(); //改行
		
	}
}
