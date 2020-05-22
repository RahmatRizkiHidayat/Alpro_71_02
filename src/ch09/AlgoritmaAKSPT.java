package ch09;
public class AlgoritmaAKSPT{
static long c[] = new long[100]; 

	static void coef(int n){ 
		c[0] = 1; 
		for (int x = 0; x < n; c[0] = -c[0], x++) { 
			c[1 + x] = 1; 

			for (int y = x; y > 0; y--) 
				c[y] = c[y - 1] - c[y]; 
		} 
	} 
	static boolean isPrime(int n){
		coef(n); 

		c[0]++; 
		c[n]--; 

		int x = n; 
		while ((x--) > 0 && c[x] % n == 0) 
			; 
		return x < 0; 
	}
}