package ch03;
import java.util.Scanner;
public class ObjectNilaiTertinggi2{
	public static void main(String[]args){
		NilaiTertinggi2 nilai = new NilaiTertinggi2();
		System.out.println(" Menentukan Variabel tertinggi Antara X,Y dan Z ");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Variabel X : ");
		nilai.x = a.nextInt();
		
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Variabel Y : ");
		nilai.y = b.nextInt();

		Scanner c = new Scanner (System.in);
		System.out.print(" Masukkan Variabel Z : ");
		nilai.z = c.nextInt();
		
		nilai.cetak();
		
	}
}