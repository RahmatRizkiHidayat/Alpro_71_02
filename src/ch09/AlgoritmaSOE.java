package ch09;
public class AlgoritmaSOE{
	void sieveOfEratosthenes(int n){ 
		boolean prime[] = new boolean[n+1]; 
		for(int x=0;x<n;x++) 
			prime[x] = true; 
		
		for(int y = 2; y*y <=n; y++) 
		{ 
			if(prime[y] == true) 
			{ 
				for(int x = y*y; x <= n; x += y) 
					prime[x] = false; 
			} 
		} 
		for(int x = 2; x <= n; x++) 
		{ 
			if(prime[x] == true) 
				System.out.print(x + " "); 
		} 
	}
}