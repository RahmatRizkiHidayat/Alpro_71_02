package ch08;

public class AlgoritmaKMP{
	void KMPSearch(String pat, String txt){ 
		int M = pat.length(); 
		int N = txt.length(); 

		int lps[] = new int[M]; 
		int y = 0;
		computeLPSArray(pat, M, lps); 

		int x = 0;
		while (x < N) { 
			if (pat.charAt(y) == txt.charAt(x)) { 
				y++; 
				x++; 
			} 
			if (y == M) { 
				System.out.println("Pola "
								+ "di index ke : " + (x - y)); 
				y = lps[y - 1]; 
			} 
			else if (x < N && pat.charAt(y) != txt.charAt(x)) { 
				if (y != 0) 
					y = lps[y - 1]; 
				else
					x = x + 1; 
			} 
		} 
	} 
	void computeLPSArray(String pat, int M, int lps[]){ 
		int len = 0; 
		int x = 1; 
		lps[0] = 0;
		while (x < M) { 
			if (pat.charAt(x) == pat.charAt(len)) { 
				len++; 
				lps[x] = len; 
				x++; 
			} 
			else{ 
				if (len != 0) { 
					len = lps[len - 1]; 

				} 
				else{ 
					lps[x] = len; 
					x++; 
				} 
			} 
		} 
	} 
}