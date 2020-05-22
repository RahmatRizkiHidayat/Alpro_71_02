package ch08;
public class AlgoritmaLCSP{
	public static int LCSubStr(char X[], char Y[], int m, int n){ 
		
		int LCStuff[][] = new int[m + 1][n + 1]; 
		int result = 0;
		
		for (int x = 0; x <= m; x++){ 
			for (int y = 0; y <= n; y++){ 
				if (x == 0 || y == 0) 
					LCStuff[x][y] = 0; 
				else if (X[x - 1] == Y[y - 1]){ 
					LCStuff[x][y] = LCStuff[x - 1][y - 1] + 1; 
					result = Integer.max(result, LCStuff[x][y]); 
				} 
				else
					LCStuff[x][y] = 0; 
			} 
		} 
		return result; 
	} 
}