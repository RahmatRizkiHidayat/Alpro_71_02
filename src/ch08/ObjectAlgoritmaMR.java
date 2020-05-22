package ch08;
import java.io.*; 
import java.math.*; 

public class ObjectAlgoritmaMR{
	public static void main(String args[]) { 
		System.out.println(" Program Algoritma Miller - Rabbin! ");
		System.out.println();
		AlgoritmaMR object = new AlgoritmaMR();
		int k = 4;
		System.out.print(" Menampilkan Semua Prima " + "Dari 212: "); 
								
		for (int n = 1; n < 212; n++) 
			if (object.isPrime(n, k)) 
				System.out.print(n + " "); 
	}
}