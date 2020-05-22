package ch09;
import java.util.Scanner;
public class ObjectAlgoritmaSOS{
	public static void main(String[] args) {
		AlgoritmaSOS algoritma = new AlgoritmaSOS();
		System.out.println(" Program Algoritma Sieve of Sundaram! ");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Batas Bilangan : ");
		int n = a.nextInt(); 
		System.out.print(" Menampilkan Bilangan Prima kecil dari "+ n +" : ");
		algoritma.SieveOfSundaram(n); 
		}	
}