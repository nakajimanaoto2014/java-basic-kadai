package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
		public KatoIchiro_Chapter18() {
			familyName ="加藤";
			address = "東京都中野区○×";
		}
		
	
	
	@Override
	void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
	public void setGivenName(String name) {
		this.giveName = name;
}
}
