import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem11651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n= sc.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] a1, int[] a2) {
				if(a1[1] == a2[1]) {
					return a1[0] - a2[0];	 			
					}
				else {
					return a1[1] - a2[1];
				}
			}
		});
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
