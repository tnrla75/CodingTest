/*import java.util.*;


class xy{ //xy��ǥ ���� Ŭ����
	int x;
	int y;
	
	public xy(int x,int y) {
		this.x= x;
		this.y =y;
	}
}

public class Task04 {
	static int node[][]; // 2���� �̷� �迭
	static int check[][]; // 2���� �湮���� �迭
	static int cnt =1; // �������� (1,1)�� ī��Ʈ�� ���·� �����ϱ� ������ 1�� �ʱ�ȭ
	static int n,m;
	
	public static void bfs(int a,int b) { //BFS�޼ҵ�
		Queue<xy> queue = new LinkedList<>(); // ť
		a-=1; // �������� 1,1�� �����Ƿ� -1�� ���¸� �������ش�.
		b-=1;
		check[a][b]= cnt; // �ʱ� cnt���� ���� �湮�迭���� �������� �����Ѵ�.
		
		queue.offer(new xy(a,b)); // �������� ��ü�� ť�� ����
		while(!queue.isEmpty()) { // ���� ť�� ������ �� �� ���� �ݺ��Ѵ�.
			int x = queue.peek().x; // ť�� ����Ǿ� �ִ� ��ü���� x,y��ǥ�� ����
			int y = queue.peek().y;
			queue.poll(); // ť���� peek�� ������ ���̱� ������ ������ poll()�������� �ش� ��ü �Ҹ�
			
					//�Ʒ��� ���ǹ��� DFS�Խñۿ��� ����� ���ǹ��� ����
                    //�ٸ��е��� ������ 2�� �迭�� ��,��,��,���� Ž���ϴ� ����� ����ϴµ� 
                    //���߿� �ð��� ���� �м� �غ��߰ڴ�.
					if(y<node[x].length-1&&node[x][y]==1&&node[x][y+1]==1 && check[x][y+1]==0) {
						check[x][y+1]=check[x][y]+1; // ���� ���� ������ �ִ� ��ΰ��� ������ ���� �湮�迭�� ���� 
						queue.offer(new xy(x,y+1)); // ������ ���� ť�� �־��ش�.
					//�Ʒ��� ��� �̿� ����
					}
					 if(x<node.length-1&&node[x][y]==1&&node[x+1][y]==1 && check[x+1][y]==0) {
						check[x+1][y]=check[x][y]+1;
						queue.offer(new xy(x+1,y));
						
					}  if(x>0&&node[x][y]==1&&node[x-1][y]==1 && check[x-1][y]==0) {
						check[x-1][y]=check[x][y]+1;
						queue.offer(new xy(x-1,y));
						
					}
					 if(y>0&&node[x][y]==1&&node[x][y-1]==1 && check[x][y-1]==0) {
						check[x][y-1]=check[x][y]+1;
						queue.offer(new xy(x,y-1));
					}
			}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		 n = sc.nextInt();
		 m = sc.nextInt();
		node = new int [n][m];
		check = new int[n][m];
		for(int i=0;i<n;i++) { // �ٴ����� �Է��� �̷���� �� ���� �����ϴ� ���
			String row = sc.next();
			for(int j=0;j<m;j++) {
				
				node[i][j] = row.charAt(j)-'0';
			}
		}
		
		bfs(1,1); // ������ ����
		
		System.out.println(check[n-1][m-1]); // �湮�迭�� ������ ���� ��, ���������� ���� ��ȯ�ϸ� 
        									// �װ��� �ִܰ�ΰ� �ȴ�.

	}
	
}*/