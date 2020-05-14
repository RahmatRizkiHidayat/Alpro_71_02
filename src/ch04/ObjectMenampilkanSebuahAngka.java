package ch04;
import java.util.Scanner;
public class ObjectMenampilkanSebuahAngka{
	public static void main(String[] args) {
		MenampilkanSebuahAngka matriks = new MenampilkanSebuahAngka();

		System.out.println();

		matriks.cetak();

		System.out.println();
		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Angka yang akan Dicari didalam index : ");
		matriks.angka = a.nextInt();

		System.out.println();		
		matriks.cetak2();
	}
}