package ch03;
import java.util.Scanner;

public class ObjectPembagiTerkecil{
	public static void main(String[] args) {
		PembagiTerkecil pembagi = new PembagiTerkecil();

		Scanner nilai = new Scanner (System.in);
		System.out.println(" Menentukan Bilangan Pembagi terkecil selain 1 dan 2 ");
		System.out.println();
		System.out.print(" Masukkan Bilangan : ");
		pembagi.nilai = nilai.nextInt();

		pembagi.cetak();
	}
}