package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    HashMap<String, String> dictionary = new HashMap<>();

    public Dictionary_Chapter21() {
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    public String line(String word) {
        if (dictionary.containsKey(word)) {
            return word + "の意味は" + dictionary.get(word) + "です";
        } else {
            return word + "は辞書に存在しません";
        }
    }
}
