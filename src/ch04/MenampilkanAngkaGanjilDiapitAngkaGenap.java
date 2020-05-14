package ch04;
import java.util.Scanner;
public class MenampilkanAngkaGanjilDiapitAngkaGenap{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};


	public void cetak(){
		for (int x = 0; x < 12 ; x++ ) {	
			
			if (angka[x]%2==1) {
				System.out.print(angka[x]+" , ");
			}
			
		}
	}

}