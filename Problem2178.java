import java.util.*;
public class Problem2178 {
	static int n,m;
	static int[][] a;
	
	static Queue<int[]> queue = new LinkedList<>();
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String row = sc.next();
			for(int j = 0; j < m; j++) {
				a[i][j] = row.charAt(j) - '0';
			}
		}
		
		System.out.print(bfs(0,0));
		
	}
	
	public static int bfs(int x, int y) {
		queue.add(new int[] {x,y});
		
		while(!queue.isEmpty()) {
			int[] curr = queue.poll();
			int curX = curr[0];
			int curY = curr[1];
			
			for(int i = 0; i < 4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}
				
				if(a[nx][ny] == 1) {
					a[nx][ny] = a[curX][curY] + 1;
					queue.add(new int[] {nx, ny});
				}
			}
		}
		return a[n-1][m-1];
	}
}
