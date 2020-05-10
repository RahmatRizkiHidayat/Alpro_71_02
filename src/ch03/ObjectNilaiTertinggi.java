package ch03;
import java.util.Scanner;
public class ObjectNilaiTertinggi{
	public static void main(String[]args){
		NilaiTertinggi bil = new NilaiTertinggi();
		System.out.println(" Menentukan Nilai Variabel tertinggi dari X dan Y");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Variabel X : ");
		bil.x = a.nextInt();
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Variabel Y : ");
		bil.y = b.nextInt();
		
		bil.cetak();
		
	}
}
