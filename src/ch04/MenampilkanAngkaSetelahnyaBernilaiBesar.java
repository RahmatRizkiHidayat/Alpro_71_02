package ch04;
import java.util.Scanner;
import java.util.Arrays;
public class MenampilkanAngkaSetelahnyaBernilaiBesar{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};

	public void cetak(){	
		Arrays.sort(angka);
		for (int x = 0; x < angka.length ; x++ ) {	
			System.out.print(angka[x]+" , ");
			
			}
	}

}