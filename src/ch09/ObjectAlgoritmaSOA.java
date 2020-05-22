package ch09;
import java.util.Scanner;
public class ObjectAlgoritmaSOA{

	public static void main(String[] args){ 
		AlgoritmaSOA algoritma = new AlgoritmaSOA();
		System.out.println(" Program Algoritma Sieve of Atkin! ");
		System.out.println();
		Scanner a = new Scanner(System.in);
		System.out.print(" Masukkan batas Bilangan Prima : ");
		int limit = a.nextInt(); 

		
		System.out.print(" Menampilkan Bilangan Prima Kecil dari "+limit+" : ");
		algoritma.SieveOfAtkin(limit); 
	}
}