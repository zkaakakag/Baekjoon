import java.util.*;
public class Problem10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] arr = new String[n][2];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.next();
			}
		}
		
		Arrays.sort(arr, new Comparator<String[]> () {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
					return 0;
				}else {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				}
			}
			
		});
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
