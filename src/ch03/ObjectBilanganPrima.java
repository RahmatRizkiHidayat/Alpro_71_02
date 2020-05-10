package ch03;
import java.util.Scanner;
public class ObjectBilanganPrima{
	public static void main(String[] args) {
		BilanganPrima prima = new BilanganPrima();

		System.out.println(" Menentuan Sebuah Angka Bilangan Prima atau Tidak ");
		System.out.println();

		Scanner angka = new Scanner (System.in);
		System.out.print(" Masukkan Angka : ");
		prima.angka = angka.nextInt();

		prima.cetak();

	}
}