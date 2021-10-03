package week_3;

public class num_10 {

	public static void main(String[] args) {
		int x=0, y=0, cnt=0;
		int [][] arr = new int[4][4];		//기본값 0으로 초기화
		
		while(true) {
			x = (int)(Math.random()*4);		//좌표 랜덤 생성
			y = (int)(Math.random()*4);
			
			if(arr[x][y] == 0) {
				arr[x][y] = (int)(Math.random()*10 + 1);
				cnt++;		//값이 잘 들어갔음을 표시
			}
			if(cnt>=10) {	//열개 잘 넣었으면 탈출
				break;
			}
		}
		for(int i=0; i<4; i++) {		//배열 출력
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
