//น้มุ
import java.io.*;
import java.util.*;

public class Problem1316 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int  n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i = 0; i <n; i++) {
			String str = br.readLine();
			boolean done = true;
			for(int j=0; j<str.length();j++) {
				char c = str.charAt(j);
				int index = str.indexOf(c,j+1);
				if(index - j > 1) {
					done = false;
					break;
				}else if(index - j ==1) {
					done = true;
				}
			}
			if(done) {
				cnt++;
			}
			
			
		}
		System.out.println(cnt);
	}

}
