package ch09;
import java.util.Scanner;
public class ObjectAlgoritmaSOE{
	
public static void main(String args[]){ 
		System.out.println(" Program Algoritma Sieve Of Eratosthenes! ");
		System.out.println();

		AlgoritmaSOE algoritma = new AlgoritmaSOE();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Batas Bilangan : ");
		int n = a.nextInt(); 
		
		System.out.print(" Bilangan Prima "); 
		System.out.print(" Kecil dari " + n + " : "); 
		
		algoritma.sieveOfEratosthenes(n); 
	}
}