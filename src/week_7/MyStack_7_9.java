package week_7;

class GStack<T> {
	int top;
	Object[] stck;
	public GStack() {	//������
		top = 0;
		stck = new Object[10];
	}
	public void push(T val) {
		if(top == 10) {		//������
			return;
		}
		stck[top] = val;
		top++;
	}
	public T pop() {
		if(top == 0)
		return null;
		top--;
		return (T)stck[top]; 
	}
}

public class MyStack_7_9 {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		for(int n=0; n<3; n++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		for(int n=0; n<3; n++) {
			System.out.println(intStack.pop());
		}
		
	}

}
