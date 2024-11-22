import java.util.*;
import java.io.*;

public class Problem15650 {
	static int n,m;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visited = new boolean[n];
		
		permutation(1,0);
	}
	
	
	public static void permutation(int start,int depth) {
		if(depth == m) {
			Arrays.sort(arr);
			for(int i =0; i<m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = start; i<=n; i++) {
			arr[depth] = i;
			permutation(i+1,depth+1);
		}
	}
	

}
