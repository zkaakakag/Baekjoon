import java.util.*;
public class Problem11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i = 1; i < n; i++) {
			arr[i] += arr[i-1];

		}
	    
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
