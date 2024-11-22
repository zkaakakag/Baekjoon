import java.util.*;
public class Problem1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		
		for(int i = 0; i<n;i++) {
			for(int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		int cnt = 0;
		int last = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i][0] >= last) {
				cnt++;
				last = a[i][1];
			}
		}
		
		System.out.println(cnt);
	}
}
