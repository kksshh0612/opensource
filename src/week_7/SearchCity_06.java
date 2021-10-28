package week_7;

import java.util.*;
class Location {
	String name;
	int column, row; 
	public Location() {
		name = "";
		column = 0;
		row = 0;
	}
	public Location(String name, int column, int row) {
		this.name = name;
		this.column = column;
		this.row = row;
	}
	public void Print() {
		System.out.println(name + " " + column + " " + row);
	}
	public String ReturnName() {
		return name;
	}
}

public class SearchCity_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Location[] loc = new Location[4];
		//HashMap<String, Location> hashmap = new HashMap<String, Location>();
		String str;
		String city[];
		
		System.out.println("도시, 경도, 위도를 입력하시오");
		
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			str = sc.nextLine();
			city = str.split(", ");		//,기준으로 문자열 슬라이싱
			loc[i] = new Location(city[0], Integer.parseInt(city[1]), Integer.parseInt(city[2]));
			//위에는 객체를 담을 배열만 선언한 것이고, 실제 객체를 하나씩 선언해줘야됨.!!!!!!!
		}
		System.out.println("------------------------------");
		for(int i=0; i<4; i++) {
			loc[i].Print();
		}
		System.out.println("------------------------------");
		while(true) {
			int check = 0;
			String city_name = "";
			System.out.println("도시 이름>> ");
			city_name = sc.next();
			
			if(city_name.equals("그만")) {
				break;
			}
			
			for(int i=0; i<4; i++) {
				if(city_name.equals(loc[i].ReturnName())){
					loc[i].Print();
					check = 1;
					break;
				}
			}
			if(check==0) {
				System.out.println(city_name + "는 없습니다.");
			}
		}
		
		sc.close();
	}

}
