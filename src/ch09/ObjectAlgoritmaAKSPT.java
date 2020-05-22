package ch09;
import java.util.Scanner;
public class ObjectAlgoritmaAKSPT{
	public static void main(String[] args) {
		AlgoritmaAKSPT algoritma = new AlgoritmaAKSPT();
		System.out.println();
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Bilangan : ");
		int n = a.nextInt(); 
		if (algoritma.isPrime(n)) 
			System.out.println(" " + n + " Bilangan Prima"); 
		else
			System.out.println(" " + n + " Bukan Bilangan Prima"); 
	} 
	
}