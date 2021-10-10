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
	public Dictionary(int num) {		//������
		keyArray = new String[num];
		valueArray = new String[num];
		for(int i=0; i<10; i++) {		//�ʱ�ȭ
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
			if(keyArray[i] == "") {		//���� ��������� �� �߰�
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			}
		}
	}
	
	String delete(String key) {
		String return_val = "";
		for(int i=0; i<keyArray.length; i++) {
			if(key == keyArray[i]) {		//�̹� key�� �ش��ϴ� ���� ������
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
		dic.put("�輺ȣ", "�ڹ�");
		dic.put("�ӻ��", "���̽�");
		dic.put("�ӻ��", "��Ʋ��");
		System.out.println("�輺ȣ�� ���� " + dic.get("�輺ȣ"));
		System.out.println("�ӻ���� ���� " + dic.get("�ӻ��"));
		dic.delete("�ӻ��");
		System.out.println("�ӻ���� ���� " + dic.get("�ӻ��"));
	}
}
