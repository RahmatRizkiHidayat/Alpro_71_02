package ch05;
public class ObjectAlgoritmaKadane{
	public static void main(String[] args) {
		
		System.out.println(" Program Menentukan Nilai Maximum dari Subarray");
		System.out.println();

		AlgoritmaKadane x = new AlgoritmaKadane();
		int arrA[] = { -2, -5, 6, -2, -3, 1, 5, -6 };
		x.cetak();
		System.out.println();
		System.out.println("Maximum subarray : " + x.kandane(arrA));
		
		int arrB[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		x.cetak2();
		System.out.println();
		System.out.println("Maximum Subarray : " + x.KandaneModify(arrB));
	}
}
