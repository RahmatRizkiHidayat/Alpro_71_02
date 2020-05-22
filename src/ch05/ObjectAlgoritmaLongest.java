package ch05;
import java.util.Scanner;
public class ObjectAlgoritmaLongest{
public static void main(String[] args){ 
		AlgoritmaLongest lcs = new AlgoritmaLongest(); 
		System.out.println(" Program Algoritma Longest : ");
		
		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Bilangan Pertama : ");
		String s1 = a.nextLine();
		
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Bilangan Kedua : ");
		String s2 = b.nextLine();

		char[] X = s1.toCharArray(); 
		char[] Y = s2.toCharArray(); 
		int m = X.length; 
		int n = Y.length; 

		System.out.println(" Length Dari LCS Adalah : " + lcs.lcs(X, Y, m, n)); 
	} 
}