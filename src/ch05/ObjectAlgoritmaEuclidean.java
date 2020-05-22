package ch05;
import java.util.Scanner;
public class ObjectAlgoritmaEuclidean{
	public static void main(String[]args){
		AlgoritmaEuclidean euclidean= new AlgoritmaEuclidean();
		System.out.println(" Program Mencari PBB ");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Pertama : ");
		euclidean.m = a.nextInt();
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Kedua : ");
		euclidean.n = b.nextInt();
		
		euclidean.cetak();
		
	}
}