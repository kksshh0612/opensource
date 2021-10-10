package week_5;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap {
	public Dictionary(int num) {		//생성자
		keyArray = new String[num];
		valueArray = new String[num];
		for(int i=0; i<10; i++) {		//초기화
			keyArray[i] = "";
			valueArray[i] = "";
		}
	}
	
	String get(String key) {
		for(int i=0; i<keyArray.length; i++) {
			if(key == keyArray[i]) {
				return valueArray[i];
			}
		}
		return null;
	}
	
	void put(String key, String value) {
		for(int i=0; i<keyArray.length; i++) {
			if(key == keyArray[i]) {
				valueArray[i] = value;
				return;
			}
			if(keyArray[i] == "") {		//값이 비어있으면 값 추가
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			}
		}
	}
	
	String delete(String key) {
		String return_val = "";
		for(int i=0; i<keyArray.length; i++) {
			if(key == keyArray[i]) {		//이미 key에 해당하는 값이 있으면
				keyArray[i] = "";
				return_val = valueArray[i];
				valueArray[i] = "";
				return return_val;
			}
		}
		return null;
	}
	
	int length() {
		return keyArray.length;
	}
}

public class DictionaryApp_10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("김성호", "자바");
		dic.put("임상우", "파이썬");
		dic.put("임상우", "코틀린");
		System.out.println("김성호의 값은 " + dic.get("김성호"));
		System.out.println("임상우의 값은 " + dic.get("임상우"));
		dic.delete("임상우");
		System.out.println("임상우의 값은 " + dic.get("임상우"));
	}
}
