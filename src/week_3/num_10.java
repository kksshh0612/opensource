package week_3;

public class num_10 {

	public static void main(String[] args) {
		int x=0, y=0, cnt=0;
		int [][] arr = new int[4][4];		//�⺻�� 0���� �ʱ�ȭ
		
		while(true) {
			x = (int)(Math.random()*4);		//��ǥ ���� ����
			y = (int)(Math.random()*4);
			
			if(arr[x][y] == 0) {
				arr[x][y] = (int)(Math.random()*10 + 1);
				cnt++;		//���� �� ������ ǥ��
			}
			if(cnt>=10) {	//���� �� �־����� Ż��
				break;
			}
		}
		for(int i=0; i<4; i++) {		//�迭 ���
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
