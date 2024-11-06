import java.util.*;
public class Problem1260 {
	
	static int n,m,s;
	static int[][] a;
	static boolean[] visited;
	
	static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		
		a = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			
			a[v][w] = a[w][v] = 1;
		}
		
		dfs(s);
		System.out.println();
		visited = new boolean[n+1];
		
		bfs(s);
		
	}
	
	public static void dfs(int s) {
		visited[s] = true;
		System.out.print(s + " ");
		for(int i = 1; i <= n; i++) {
			if(a[s][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int s) {
		queue.add(s);
		visited[s] = true;
		while(!queue.isEmpty()) {
			s = queue.poll();
			System.out.print(s + " ");
			for(int i = 1; i <= n; i++) {
				if(a[s][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}

}
