import java.io.*;
import java.util.*;
public class Problem15686 {
	static int n,m;
	static int[][] arr;
	static List<int[]> houses = new ArrayList<>();
	static List<int[]> chickenShops = new ArrayList<>();
	static int minCityDistance = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					houses.add(new int[] {i,j});
				}else if(arr[i][j] == 2) {
					chickenShops.add(new int[] {i,j});
				}
			}
		}
		
		combination(new ArrayList<>(), 0);
		System.out.print(minCityDistance);
	
	}
	
	
	public static void combination(List<int[]> selectedChickens, int start) {
		if(selectedChickens.size() == m) {
			int cityDistance = calculaterCityDistance(selectedChickens);
			minCityDistance = Math.min(minCityDistance, cityDistance);
			return;
		}
		for(int i = start; i < chickenShops.size(); i++) {
			selectedChickens.add(chickenShops.get(i));
			combination(selectedChickens, i+1);
			selectedChickens.remove(selectedChickens.size() -1);
		}
	}
	
	
	public static int calculaterCityDistance(List<int[]> selectedChickens) {
		int totalDistance = 0;
		
		for(int[] house: houses) {
			int minDistance= Integer.MAX_VALUE;
			for(int[] chickenShop : selectedChickens) {
					int distance = Math.abs(house[0] - chickenShop[0]) + Math.abs(house[1] - chickenShop[1]);
					minDistance = Math.min(minDistance,distance);
			}
			totalDistance += minDistance;
		}
		return totalDistance;
	}

}
