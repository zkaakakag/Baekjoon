import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split("-");
		
		String[] first = arr[0].split("\\+");
		int result = 0;
		for(String n : first) {
			result += Integer.parseInt(n);
		}
		
		for(int i =1; i < arr.length;i++) {
			String[] second = arr[i].split("\\+");
			int sum = 0;
			for(String n : second) {
				sum += Integer.parseInt(n);
			}
			result -= sum;
		}
		
		System.out.println(result);
		br.close();
		
	}

}
