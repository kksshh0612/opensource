package week_7;

public class GenericMethodExample_7_10 {
	public static <T> GStack<T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>();
		while (true) {
			T tmp;
			tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄
			if (tmp==null) // 스택이 비었음
				break;
			else
				s.push(tmp); // 새 스택에 요소를 삽입
		}
		return s; // 새 스택을 반환
	}
	
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		for (int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs = reverse(gs);
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}

}
