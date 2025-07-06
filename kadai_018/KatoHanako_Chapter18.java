package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	//フィールドに直接セット
	public KatoHanako_Chapter18() {
		familyName = "加藤";
		address = "東京都中野区○×";
	}
	
@Override
void eachIntroduce() {
	System.out.println("趣味は読書です");
}
public void setGivenName(String name) {
	this.giveName = name;
}
}

