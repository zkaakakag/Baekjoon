import java.io.*;
import java.util.*;

public class Problem2477 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int[][] arr = new int[6][2];
		
		for(int i =0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j <2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int maxHeight=0;
		int maxWidth=0;
		int height = 0;
		int width=0;
		
		for (int i = 0; i < 6; i++) {
            if (arr[i][0] == 1 || arr[i][0] == 2) {
                maxWidth = Math.max(maxWidth, arr[i][1]);
            }
            if (arr[i][0] == 3 || arr[i][0] == 4) {
                maxHeight = Math.max(maxHeight, arr[i][1]);
            }
        }
		
		for (int i = 0; i < 6; i++) {
            if (arr[i][0] == 1 && arr[(i + 1) % 6][0] == 3) {
                height = arr[(i + 1) % 6][1];
                width = arr[i][1];
            }
            if (arr[i][0] == 3 && arr[(i + 1) % 6][0] == 2) {
                height = arr[i][1];
                width = arr[(i + 1) % 6][1];
            }
            if (arr[i][0] == 2 && arr[(i + 1) % 6][0] == 4) {
                height = arr[(i + 1) % 6][1];
                width = arr[i][1];
            }
            if (arr[i][0] == 4 && arr[(i + 1) % 6][0] == 1) {
                height = arr[i][1];
                width = arr[(i + 1) % 6][1];
            }
        }
	        
		int result = k * ((maxHeight*maxWidth) - (height*width));
		System.out.println(result);
	}

}
