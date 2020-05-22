package ch08;
import java.util.Scanner;
public class ObjectAlgoritmaLCSP{

	public static void main(String[] args){ 
		System.out.println(" Program Algoritma Longest Common Substring Problem! ");
		System.out.println();
		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Pertama : ");
		String X = a.nextLine();
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Kedua : ");
		String Y = b.nextLine();

		// String X = "OldSite:ArlanCoding.com"; 
		// String Y = "NewSite:W3School.com"; 

		AlgoritmaLCSP object = new AlgoritmaLCSP();
		int m = X.length(); 
		int n = Y.length(); 

		System.out.println(" Panjang Dari Longest Common Substring : "
				+ object.LCSubStr(X.toCharArray(), Y.toCharArray(), m, n)); 
	}
}