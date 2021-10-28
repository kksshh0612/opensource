package week_7;

import java.util.*;
public class HashMapScoreEx_7_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);

		System.out.println("HashMap의 요소 개수 :" + javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator(); 
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}
		sc.close();
	}

}
