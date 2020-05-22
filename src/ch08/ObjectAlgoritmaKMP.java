package ch08;
public class ObjectAlgoritmaKMP{
	public static void main(String args[]){ 
		System.out.println(" Program Algoritma Knuth - Morris - Pratt! ");
		System.out.println();
		AlgoritmaKMP algoritma = new AlgoritmaKMP();
		String txt = "ABCBCAACBCBBAACBACB"; 
		String pat = "AACBCBBA"; 
		algoritma.KMPSearch(pat, txt); 
	}
}