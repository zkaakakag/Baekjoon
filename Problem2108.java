import java.io.*;
import java.util.*;

public class Problem2108 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] freq = new int[8001];
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			freq[arr[i] + 4000]++;
		}
		
		Arrays.sort(arr);
		int avg = (int)Math.round((double)sum/n);
		int center = arr[n/2];
	
		int maxFreq = 0;
		List<Integer> modes = new ArrayList<>();
		for(int i = 0; i < 8001; i++) {
			if(freq[i] > maxFreq) {
				maxFreq = freq[i];
				modes.clear();
				modes.add(i - 4000);
			}else if(freq[i] == maxFreq) {
				modes.add(i-4000);
			}
		}
		
		Collections.sort(modes);
		int freqency = (modes.size()>1) ? modes.get(1) : modes.get(0);
	
		int range = arr[n-1] - arr[0];
		
		System.out.println(avg);
		System.out.println(center);
		System.out.println(freqency);
		System.out.println(range);
	}

}
