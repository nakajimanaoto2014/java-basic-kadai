package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//wordのインスタンスを作成
		Dictionary_Chapter21 word = new Dictionary_Chapter21();
		
		//調べたい単語の一覧
		String[] words = {"apple", "banana" , "grape" , "pear","orange"};
		
		//for文で繰り返し表示
		for (String w : words) {
		
		System.out.println(word.line(w));
		}

	}

}
