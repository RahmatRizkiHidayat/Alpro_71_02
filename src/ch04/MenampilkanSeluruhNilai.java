package ch04;

public class MenampilkanSeluruhNilai{
	int[] nilai = {82,12,41,38,19,26,9,48,20,55,8,32,3};

	public void cetak(){
		System.out.println("Menampilkan Seluruh Nilai di Dalam Array : ");
		System.out.println();
		for (int x = 0; x < nilai.length ; x++ ) {	
			if (x==12) {
			System.out.print(nilai[x]+".");
			}else{
			System.out.print(nilai[x]+", ");
			}
		}
	}
}