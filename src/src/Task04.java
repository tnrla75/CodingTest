/*import java.util.*;


class xy{ //xy좌표 저장 클래스
	int x;
	int y;
	
	public xy(int x,int y) {
		this.x= x;
		this.y =y;
	}
}

public class Task04 {
	static int node[][]; 
	static int check[][]; 
	static int cnt =1; 
	static int n,m;
	
	public static void bfs(int a,int b) { 
		Queue<xy> queue = new LinkedList<>(); 
		a-=1; // 시작점이 1,1로 들어오므로 -1한 상태를 저장해준다.
		b-=1;
		check[a][b]= cnt; 
		
		queue.offer(new xy(a,b)); 
		while(!queue.isEmpty()) { 
			int x = queue.peek().x; 
			int y = queue.peek().y;
			queue.poll(); 
			
					if(y<node[x].length-1&&node[x][y]==1&&node[x][y+1]==1 && check[x][y+1]==0) {
						check[x][y+1]=check[x][y]+1;  
						queue.offer(new xy(x,y+1)); 
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
		for(int i=0;i<n;i++) { 
			String row = sc.next();
			for(int j=0;j<m;j++) {
				
				node[i][j] = row.charAt(j)-'0';
			}
		}
		
		bfs(1,1); // 시작점 전달
		
		System.out.println(check[n-1][m-1]); 
	}
	
}*/