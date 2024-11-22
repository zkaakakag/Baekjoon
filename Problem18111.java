import java.io.*;
import java.util.*;
public class Problem18111 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][] arr= new int[n][m];
		
		int maxHeight = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j= 0; j <m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				maxHeight = Math.max(maxHeight, arr[i][j]);
			}
		}
		
		int minTime = Integer.MAX_VALUE;
		int targetHeight=0;
		for(int i = 0; i <= maxHeight;i++) {
			int time = 0;
			int inventory = b;
			
			for(int x = 0; x <n; x++) {
				for(int y = 0; y < m; y++) {
					int diff = arr[x][y] - i;
					if(diff > 0) {
						time += diff*2;
						inventory += diff;
					} else if(diff < 0) {
						time += -diff;
						inventory += diff;
					}
				}
			}
			
			if(inventory >= 0 && time <= minTime && time >=0) {
				minTime = time;
				targetHeight = i;
			}
		}
		
		
		System.out.print(minTime + " " +targetHeight);
		
	}
	
}
